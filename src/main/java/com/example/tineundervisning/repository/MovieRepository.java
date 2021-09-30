package com.example.tineundervisning.repository;

import com.example.tineundervisning.models.Movie;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class MovieRepository {
    private static Connection connection;

    public MovieRepository() {
        connection = DBManager.getConnection();
    }

    public Movie firstMovie() {
        String str = "select * from movies limit 1";
        ArrayList<Movie> movies = fetchMovie(str);
        return movies.get(0);
    }

    public Movie randomMovie() {
        String str = "select * from movies order by rand() limit 1";
        ArrayList<Movie> movies = fetchMovie(str);
        return movies.get(0);
    }


    public ArrayList<Movie> topTenMovies(){
        String str = "SELECT * FROM movies ORDER BY Popularity DESC LIMIT 10";
        return fetchMovie(str);
    }

    public ArrayList<Movie> topTenRandom(){
        String str = "SELECT * FROM (SELECT * FROM movies ORDER BY rand() limit 10) AS toptenrandom ORDER BY Popularity DESC";
        return fetchMovie(str);
    }


    public ArrayList<Movie> comediesWithAward(){
        String str = "SELECT * FROM (SELECT * FROM movies WHERE Subject = 'Comedy') AS comedies WHERE Awards ='Yes'";
        PreparedStatement preparedStatement;
        return fetchMovie(str);
    }

    private ArrayList<Movie> fetchMovie(String sqlStatement) {
        System.out.println("called");
        PreparedStatement preparedStatement;
        ArrayList<Movie> result = new ArrayList();
        try {
            preparedStatement = connection.prepareStatement(sqlStatement);
            ResultSet resultQuery = preparedStatement.executeQuery();
            while (resultQuery.next()) {
                Movie movie = new Movie(
                        resultQuery.getInt(2),
                        resultQuery.getInt(3),
                        resultQuery.getString(4),
                        resultQuery.getString(5),
                        resultQuery.getInt(6),
                        resultQuery.getString(7)
                );
                result.add(movie);
            }
            System.out.println("Worked");
        } catch (SQLException throwables) {
            //throwables.printStackTrace();
        }
        return result;
    }
}
