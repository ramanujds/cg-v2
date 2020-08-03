package com.capg.demo.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.movie.model.MovieRating;

public interface MovieRatingRepo extends JpaRepository<MovieRating, Integer> {

}
