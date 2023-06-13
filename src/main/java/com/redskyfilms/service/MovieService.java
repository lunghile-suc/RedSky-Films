package com.redskyfilms.service;

import java.util.List;
import java.util.Optional;

import com.redskyfilms.model.Movie;

public interface MovieService {

    Movie add_movie(Movie movie);

    List<Movie> get_all_movies();

    Optional<Movie> get_movie(Long id);
}
