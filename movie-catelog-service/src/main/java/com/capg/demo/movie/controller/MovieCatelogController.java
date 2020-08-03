package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieCatelog;
import com.capg.demo.movie.service.MovieCatelogService;

@RestController
public class MovieCatelogController {
	
	@Autowired
	MovieCatelogService service;
	
	
	@GetMapping("/catelog/id/{id}")
	public MovieCatelog getMovieInfo(@PathVariable int id) {
		return service.getCatelog(id);
	}
	
	@PostMapping("/catelog/add")
	public MovieCatelog addMovieCatelog(@RequestBody MovieCatelog catelog) {
		return service.addCatelog(catelog);
	}

}
