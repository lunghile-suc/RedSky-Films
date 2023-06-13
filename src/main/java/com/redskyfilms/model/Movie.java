package com.redskyfilms.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movie_id;
    private String movie_name;
    private String movie_genre;
    private String movie_language;
    private String movie_running_time;

    @JsonBackReference
    @ManyToMany
    @JoinTable(
        name = "movie_actor",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    @Cascade({ CascadeType.MERGE, CascadeType.PERSIST})
    private List<Actor> movie_actors = new ArrayList<Actor>();
}
