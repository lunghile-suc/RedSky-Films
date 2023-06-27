package com.redskyfilms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redskyfilms.exceptions.MovieNotFound;
import com.redskyfilms.model.Movie;
import com.redskyfilms.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
    
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie add_movie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> get_all_movies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> get_movie(Long id) {

        Movie movie = movieRepository.findById(id).orElse(null);

        if(movie==null){
            throw new MovieNotFound("Movie not found with id " + id);
        }else{
            return movieRepository.findById(id);
        }
    }
}
