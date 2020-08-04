package com.capg.demo.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.capg.demo.movie.model.MovieCatelog;
import com.capg.demo.movie.repo.MovieCatelogRepo;

@Service
public class MovieCatelogService {

	
	@Autowired
	private MovieCatelogRepo repo;
	
	@Autowired
	Environment env;
	
	public int GetPortNo() {
		return Integer.parseInt(env.getProperty("local.server.port"));
		
	}
	
	public MovieCatelog addCatelog(MovieCatelog catelog) {
		
		 MovieCatelog savedCatelog=repo.save(catelog);
		 savedCatelog.setPort(GetPortNo());
		 return savedCatelog;
	}
	
	public MovieCatelog getCatelog(int id) {
		MovieCatelog savedCatelog=repo.getOne(id);
		savedCatelog.setPort(GetPortNo());
		System.out.println(savedCatelog);
		 return savedCatelog;
	}
	
	
}
