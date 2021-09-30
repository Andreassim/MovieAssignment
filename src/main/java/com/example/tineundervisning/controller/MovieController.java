package com.example.tineundervisning.controller;

import com.example.tineundervisning.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping("/magic")
    public String magic() {
            return movieService.firstMovie().asTableData();
    }

    @GetMapping("/random")
    public String randomMovie() {
        return movieService.randomMovie().asTableData();
    }

   @GetMapping("/topten")
    public String topTenMovie() {
        return movieService.topTenMovies();
    }

    @GetMapping("/randomTopTen")
    public String topTenRandom() {
        return movieService.topTenRandom();
    }

    @GetMapping("/comedieswithaward")
    public String comediesWithAward(){
        return movieService.comediesWithAward();
    }
}
