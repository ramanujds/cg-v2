package com.capg.demo.movie.model;

public class MovieInfo {

	private int id;
	private String movieName;
	private double rating;
	private int movieRatingPort;
	private int movieCatelogPort;
	public MovieInfo(int id, String movieName, double rating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.rating = rating;
	}
	
	public MovieInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public int getMovieRatingPort() {
		return movieRatingPort;
	}

	public void setMovieRatingPort(int movieRatingPort) {
		this.movieRatingPort = movieRatingPort;
	}

	public int getMovieCatelogPort() {
		return movieCatelogPort;
	}

	public void setMovieCatelogPort(int movieCatelogPort) {
		this.movieCatelogPort = movieCatelogPort;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
