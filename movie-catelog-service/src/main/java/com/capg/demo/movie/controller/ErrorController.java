package com.capg.demo.movie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.demo.movie.exception.MovieNotFoundException;

@RestControllerAdvice
public class ErrorController {

	@ExceptionHandler(value = {MovieNotFoundException.class})
	@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Movie Not Found")
	public void handleNotFoundException() {
		
	}

	
	
	
}
