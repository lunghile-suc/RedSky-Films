package com.redskyfilms.repository;

import org.springframework.stereotype.Repository;

import com.redskyfilms.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long > {
    
}
