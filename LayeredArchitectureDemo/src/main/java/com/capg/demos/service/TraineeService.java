package com.capg.demos.service;

import com.capg.demos.model.Trainee;

public interface TraineeService {
	
	public void addTrainee(Trainee trainee);
	public void deleteTrainee(int id);
	public Trainee getTrainee(int id);

}
