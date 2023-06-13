package com.redskyfilms.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Actor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actor_id;

    private String actor_name;

    @JsonManagedReference
    @ManyToMany(
        mappedBy = "movie_actors")
    @Cascade({ CascadeType.MERGE, CascadeType.PERSIST})
    private List<Movie> movies = new ArrayList<Movie>();
}
