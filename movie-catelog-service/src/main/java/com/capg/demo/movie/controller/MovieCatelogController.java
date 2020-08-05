package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieCatelog;
import com.capg.demo.movie.service.MovieCatelogService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MovieCatelogController {
	
	@Autowired
	MovieCatelogService service;
	@Autowired
	Environment env;
	
	public int GetPortNo() {
		return Integer.parseInt(env.getProperty("local.server.port"));
		
	}
	
	//savedCatelog.setPort(GetPortNo());
	
	@GetMapping("/catelog/id/{id}")
	@HystrixCommand(fallbackMethod = "getMovieInfoFallback")
	public MovieCatelog getMovieInfo(@PathVariable int id) throws InterruptedException {
		
			Thread.sleep(5000);
		
		return service.getCatelog(id);
	}
	
	@PostMapping("/catelog/add")

	public MovieCatelog addMovieCatelog(@RequestBody MovieCatelog catelog) {
		return service.addCatelog(catelog);
	}
	
	public MovieCatelog getMovieInfoFallback(@PathVariable int id) {
		return new MovieCatelog(id, "WAR");
	}

}
