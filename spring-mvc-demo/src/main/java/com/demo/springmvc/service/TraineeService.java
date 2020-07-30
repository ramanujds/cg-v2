package com.demo.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springmvc.dao.TraineeDao;
import com.demo.springmvc.model.Trainee;

@Service
public class TraineeService {

	@Autowired
	TraineeDao dao;
	
	public Trainee addTrainee(Trainee t1) {
		return dao.addTrainee(t1);
	}
	
	public Trainee getTrainee(int tId) {
		return dao.fetchTrainee(tId);
	}
	
	
}
