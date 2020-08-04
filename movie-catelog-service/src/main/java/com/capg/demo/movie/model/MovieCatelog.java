package com.capg.demo.movie.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class MovieCatelog {
	@Id private int id;
	private String movieName; 
	@Transient
	private int port;
	
	
	
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


	public MovieCatelog() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MovieCatelog(int id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "MovieCatelog [id=" + id + ", movieName=" + movieName + ", port=" + port + "]";
	}
	
	
	
	
}
