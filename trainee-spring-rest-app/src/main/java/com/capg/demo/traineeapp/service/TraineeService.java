package com.capg.demo.traineeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.traineeapp.model.Trainee;
import com.capg.demo.traineeapp.repo.TraineeRepo;

@Service
public class TraineeService {

	@Autowired
	TraineeRepo repo;
	
	public Trainee getTrainee(int id) {
		return repo.getTrainee(id);
	}
	
	public Trainee addTrainee(Trainee trainee) {
		return repo.addTrainee(trainee);
	}
	
	public List<Trainee> getAllTrainees(){
		return repo.getAllTrainee();
	}
	
	public void removeTrainee(int id) {
		repo.deleteTrainee(id);
	}
	
}
