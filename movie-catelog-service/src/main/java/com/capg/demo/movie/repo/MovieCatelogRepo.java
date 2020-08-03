package com.capg.demo.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.demo.movie.model.MovieCatelog;

public interface MovieCatelogRepo extends JpaRepository<MovieCatelog,Integer> {

	
}
