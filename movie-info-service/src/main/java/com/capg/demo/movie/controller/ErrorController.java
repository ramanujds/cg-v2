package com.capg.demo.movie.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;

import com.capg.demo.movie.exception.MovieNotFoundException;
import com.capg.demo.movie.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(value = {HttpStatusCodeException.class})
	public ResponseEntity<ErrorResponse> handleNotFoundException(HttpStatusCodeException ex,HttpServletRequest req) {
	
		ErrorResponse response=new ErrorResponse(new Date(),ex.getMessage(),
				ex.getStatusCode().getReasonPhrase(),
				ex.getStatusCode().value(),
				req.getRequestURI());
		
		return new ResponseEntity<>(response,ex.getStatusCode());
			
	
		
		
		
	}
	
	
}
