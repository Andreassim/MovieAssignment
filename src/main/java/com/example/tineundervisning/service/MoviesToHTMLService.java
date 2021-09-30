package com.example.tineundervisning.service;

import com.example.tineundervisning.models.Movie;

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
