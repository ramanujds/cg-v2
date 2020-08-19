package com.capg.demo.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.movie.model.MovieInfo;
import com.capg.demo.movie.service.MovieInfoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class MovieInfoController {

	@Autowired
	MovieInfoService service;
	
	@GetMapping(value = "/info/id/{id}")
	//,produces = {"application/json"})
//	@HystrixCommand(fallbackMethod = "getMovieInfoFallback"
//			,
//			commandProperties = {
//					@HystrixProperty(name ="execution.timeout.enabled", value = "true" ),
//					@HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
//					@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value="2000"),
//					@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
//					@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
//					@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value="5000")
//									
//			}
//	)
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
