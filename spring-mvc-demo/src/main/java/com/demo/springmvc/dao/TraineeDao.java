package com.demo.springmvc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.springmvc.model.Trainee;

@Repository
public class TraineeDao {

	Map<Integer, Trainee> trainees=new HashMap<Integer, Trainee>();
	
	public Trainee addTrainee(Trainee t1) {
		trainees.put(t1.getId(), t1);
		return t1;
	}
	public Trainee fetchTrainee(int id) {
		return trainees.get(id);
	}
}
