package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.capg.demo.movie.model.MovieCatelog;
import com.capg.demo.movie.model.MovieInfo;
import com.capg.demo.movie.model.MovieRating;

@Service
public class MovieInfoService {

	@Autowired
	RestTemplate rt;
	@Value("${rating.get-uri}")
	private String ratingGetUri;
	@Value("${catelog.get-uri}")
	private String catelogGetUri;
	
	
	
	public String getRatingGetUri() {
		return ratingGetUri;
	}

	public void setRatingGetUri(String ratingGetUri) {
		this.ratingGetUri = ratingGetUri;
	}

	public String getCatelogGetUri() {
		return catelogGetUri;
	}

	public void setCatelogGetUri(String catelogGetUri) {
		this.catelogGetUri = catelogGetUri;
	}

	public MovieInfo getMovieInfo(int id) {
		MovieCatelog catelog=rt.getForObject("http://MOVIE-CATELOG-SERVICE/"+catelogGetUri+id, MovieCatelog.class);
		//MovieCatelog catelog=new MovieCatelog(id, "Dummy Movie");
		MovieRating rating=new MovieRating(id,4.4);
	
			//rating=rt.getForObject("http://MOVIE-RATING-SERVICE/"+ratingGetUri+id, MovieRating.class);
		
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
