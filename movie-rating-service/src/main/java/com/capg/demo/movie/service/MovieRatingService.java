package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.demo.movie.exception.MovieNotFoundException;
import com.capg.demo.movie.model.MovieRating;
import com.capg.demo.movie.repo.MovieRatingRepo;

@Service
public class MovieRatingService {

	@Autowired
	MovieRatingRepo repo;
	@Autowired
	Environment env;
	
	public int getPortNo() {
		return Integer.parseInt(env.getProperty("local.server.port"));
		
	}
	
	public MovieRating getRating(int id) {
		if(!repo.existsById(id)) {
			throw new MovieNotFoundException("Movie with id ["+id+"] is Not Available");
		}
		MovieRating rating= repo.getOne(id);
		rating.setPort(getPortNo());
		return rating;
	}
	
	public MovieRating addRating(MovieRating rating) {
		MovieRating savedRating=  repo.save(rating);
		savedRating.setPort(getPortNo());
		return savedRating;
		}
	
}
