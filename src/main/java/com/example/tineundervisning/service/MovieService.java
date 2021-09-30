package com.example.tineundervisning.service;

import com.example.tineundervisning.models.Movie;
import com.example.tineundervisning.repository.DBManager;
import com.example.tineundervisning.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie firstMovie() {
        return movieRepository.firstMovie();
    }

    public Movie randomMovie() {
        return movieRepository.randomMovie();
    }
    public String topTenMovies(){
        return MoviesToHTMLService.moviesToHtml(movieRepository.topTenMovies());
    }

    public String topTenRandom(){
         return MoviesToHTMLService.moviesToHtml(movieRepository.topTenRandom());
    }


    public String comediesWithAward(){
        return MoviesToHTMLService.moviesToHtml(movieRepository.comediesWithAward());
    }
}


