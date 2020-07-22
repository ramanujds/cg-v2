package com.capg.demos.service;

import com.capg.demos.dao.TraineeDao;
import com.capg.demos.dao.TraineeDaoCollectionsBasedImpl;
import com.capg.demos.model.Trainee;

public class TraineeServiceImpl implements TraineeService {
	
	TraineeDao dao;
	public TraineeServiceImpl() {
		dao=new TraineeDaoCollectionsBasedImpl();
	}

	@Override
	public void addTrainee(Trainee trainee) {
		dao.addTrainee(trainee);
		
	}

	@Override
	public void deleteTrainee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Trainee getTrainee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
