package com.example.movieselection.service;

import com.example.movieselection.models.Movie;

import java.util.ArrayList;

public class MoviesToHTMLService {

    public static String moviesToHtml(ArrayList<Movie> movies){
        StringBuilder stringBuilder = new StringBuilder();
        for(Movie m : movies){
            stringBuilder.append(m.asTableData());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
