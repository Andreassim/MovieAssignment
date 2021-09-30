package com.example.movieselection.service;

import com.example.movieselection.models.Movie;
import com.example.movieselection.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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


