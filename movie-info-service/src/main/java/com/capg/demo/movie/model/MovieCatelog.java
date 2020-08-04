package com.capg.demo.movie.model;


public class MovieCatelog {
	private int id;
	private String movieName; 
	private int port;
	public MovieCatelog() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MovieCatelog(int id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}

	

	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
