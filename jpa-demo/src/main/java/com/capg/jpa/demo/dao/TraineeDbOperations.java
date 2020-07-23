package com.capg.jpa.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.capg.jpa.demo.model.Trainee;

public class TraineeDbOperations {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("trainee-unit");
		
		EntityManager em=emf.createEntityManager();
		
//		Trainee t1=new Trainee(107,"Rohit","rohit106@yahoo.com");
		
		EntityTransaction tx=em.getTransaction();
		
//		tx.begin();
//		em.persist(t1);
		
//		tx.commit();
//		System.out.println("Added a new Trainee");
		tx.begin();
		Trainee t1=em.find(Trainee.class, 107);
//		em.detach(t1);
		t1.setName("Rohit Reddy");
		tx.commit();
		System.out.println(t1);
	
		
	}
	
}
