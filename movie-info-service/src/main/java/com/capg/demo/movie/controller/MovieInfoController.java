package com.capg.demo.movie.controller;

import javax.ws.rs.Produces;

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
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MovieInfoController {

	@Autowired
	MovieInfoService service;
	
	@GetMapping(value = "/info/id/{id}",produces = {"application/json"})
	@HystrixCommand(fallbackMethod = "getMovieInfoFallback")
	public MovieInfo getMovieInfo(@PathVariable int id) {
		return service.getMovieInfo(id);
	}
	
	@PostMapping("/info/add")
	public MovieInfo addMovieInfo(@RequestBody MovieInfo info) {
		return service.addMovieInfo(info);
	}
	
	
	public MovieInfo getMovieInfoFallback(@PathVariable int id) {
		return new MovieInfo(id, "3 Idiots", 4.9);
	}
	
}
