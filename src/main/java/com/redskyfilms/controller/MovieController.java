package com.redskyfilms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redskyfilms.model.Movie;
import com.redskyfilms.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    
    @Autowired
    private MovieService movieService;

    @PostMapping("/movie")
    public Movie add_movie(@RequestBody Movie movie){
        return movieService.add_movie(movie);
    }

    @GetMapping("")
    public List<Movie> get_all_movies(){
        return movieService.get_all_movies();
    }

    @GetMapping("/{id}")
    public Optional<Movie> get_movie(@PathVariable Long id){
        return movieService.get_movie(id);
    }
}
