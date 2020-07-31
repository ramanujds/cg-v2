package com.capg.dmeo.springjpa.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.dmeo.springjpa.model.Trainee;

@Repository
public class TraineeJpaRepo {
	@PersistenceContext
	EntityManager em;
	
	public Trainee addTrainee(Trainee trainee) {
		Trainee tr=em.find(Trainee.class, trainee.getTraineeId());
		if(tr!=null) {
			throw new RuntimeException("Trainee Already Exists");
		}
		return em.merge(trainee);
		
	}
	
	public Trainee getTraineeById(int traineeId) {
		return em.find(Trainee.class, traineeId);
	}
	
	public List<Trainee> getAllTrainees(){
		Query qr=em.createQuery("from Trainee");
		return qr.getResultList();
	}
	
	public void deleteTraineeById(int traineeId) {
		Trainee tr=em.find(Trainee.class, traineeId);
		if(tr!=null){
		em.remove(tr);
		}
	}
	
	
	
	
	
}
