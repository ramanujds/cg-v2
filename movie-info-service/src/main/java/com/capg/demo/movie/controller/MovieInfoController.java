package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieCatelog;
import com.capg.demo.movie.model.MovieInfo;
import com.capg.demo.movie.model.MovieRating;
import com.capg.demo.movie.service.MovieInfoService;

@RestController
public class MovieInfoController {

	@Autowired
	MovieInfoService service;
	
	@GetMapping("/info/id/{id}")
	public MovieInfo getMovieInfo(@PathVariable int id) {
		return service.getMovieInfo(id);
	}
	
	@PostMapping("/info/add")
	public MovieInfo addMovieInfo(@RequestBody MovieInfo info) {
		return service.addMovieInfo(info);
	}
	
}
