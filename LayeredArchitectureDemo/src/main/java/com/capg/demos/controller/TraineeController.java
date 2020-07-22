package com.capg.demos.controller;

import com.capg.demos.model.Trainee;
import com.capg.demos.service.TraineeService;

public class TraineeController {

	TraineeService service;
	
	public void addTrainee(Trainee trainee) {
		service.addTrainee(trainee);
	}
	
	
}
