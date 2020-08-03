package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.demo.movie.model.MovieRating;
import com.capg.demo.movie.repo.MovieRatingRepo;

@Service
public class MovieRatingService {

	@Autowired
	MovieRatingRepo repo;
	
	public MovieRating getRating(int id) {
		return repo.getOne(id);
	}
	
	public MovieRating addRating(MovieRating rating) {
		return repo.save(rating);
		}
	
}
