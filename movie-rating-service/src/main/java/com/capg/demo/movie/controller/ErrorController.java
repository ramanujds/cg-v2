package com.capg.demo.movie.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.demo.movie.exception.MovieNotFoundException;
import com.capg.demo.movie.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = {MovieNotFoundException.class})
	public ErrorResponse handleNotFoundException(Exception ex,HttpServletRequest req) {
		return new ErrorResponse(new Date(),ex.getMessage(),HttpStatus.NOT_FOUND.getReasonPhrase(),HttpStatus.NOT_FOUND.value(),req.getRequestURI());
	}
	
	
}
