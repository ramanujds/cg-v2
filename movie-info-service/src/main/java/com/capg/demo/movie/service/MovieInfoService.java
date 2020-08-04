package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.movie.model.MovieCatelog;
import com.capg.demo.movie.model.MovieInfo;
import com.capg.demo.movie.model.MovieRating;

@Service
public class MovieInfoService {

	@Autowired
	RestTemplate rt;
	
	public MovieInfo getMovieInfo(int id) {
		MovieCatelog catelog=rt.getForObject("http://MOVIE-CATELOG-SERVICE/catelog/id/"+id, MovieCatelog.class);
		MovieRating rating=rt.getForObject("http://MOVIE-RATING-SERVICE/rating/id/"+id, MovieRating.class);
		MovieInfo info=new MovieInfo(id,catelog.getMovieName(),rating.getRating());
		info.setMovieCatelogPort(catelog.getPort());
		info.setMovieRatingPort(rating.getPort());
		return info;
	}
	
	public MovieInfo addMovieInfo(MovieInfo info) {
		MovieCatelog catelog=new MovieCatelog(info.getId(),info.getMovieName());
		MovieRating rating=new MovieRating(info.getId(),info.getRating());
		catelog=rt.postForObject("http://MOVIE-CATELOG-SERVICE/catelog/add", catelog, MovieCatelog.class);
		rating=rt.postForObject("http://MOVIE-RATING-SERVICE/rating/add", rating, MovieRating.class);
		info=new MovieInfo(catelog.getId(), catelog.getMovieName(), rating.getRating());
		info.setMovieCatelogPort(catelog.getPort());
		info.setMovieRatingPort(rating.getPort());
		
		return info;
	}
	
	
}
