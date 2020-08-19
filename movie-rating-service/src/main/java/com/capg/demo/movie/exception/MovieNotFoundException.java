package com.capg.demo.movie.exception;

public class MovieNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -621776450952208362L;

	public MovieNotFoundException(String message) {
	
		super(message);
	}
}
