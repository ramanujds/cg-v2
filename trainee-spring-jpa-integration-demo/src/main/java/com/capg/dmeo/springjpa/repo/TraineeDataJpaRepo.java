package com.capg.dmeo.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.dmeo.springjpa.model.Trainee;

public interface TraineeDataJpaRepo extends JpaRepository<Trainee, Integer> {

	@Query("from Trainee where traineeName=:traineeName")
	public Trainee findByTraineeName(String traineeName);
	public Trainee findByTraineeNameAndTraineeDomain(String traineeName,String traineeDomain);
}
