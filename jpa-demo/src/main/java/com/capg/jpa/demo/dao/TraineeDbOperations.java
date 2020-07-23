package com.capg.jpa.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.capg.jpa.demo.model.Mobile;
import com.capg.jpa.demo.model.Trainee;

public class TraineeDbOperations {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("trainee-unit");
		
		EntityManager em=emf.createEntityManager();
		
//		Trainee t1=new Trainee(107,"Harish","harish06@yahoo.com");
		
		EntityTransaction tx=em.getTransaction();
		
////		tx.begin();
////		em.persist(t1);
//		
////		tx.commit();
////		System.out.println("Added a new Trainee");
//		tx.begin();
////		Trainee t1=em.find(Trainee.class, 107);
//		em.persist(t1);
////		em.remove(t1);		
////		em.detach(t1);
////		t1.setName("Rohit Reddy");
//		tx.commit();
//		System.out.println(t1);
//		String name="Rohit";
//		TypedQuery<Trainee> q=em.createQuery("from Trainee t where t.name=:name",Trainee.class);
//		q.setParameter("name", name);
		
//		Query q=em.createNamedQuery("findByEmail", Trainee.class);
//		q.setParameter("email", "harish06@yahoo.com");
//		List<Trainee> trainees=q.getResultList();
		
//		How to get a single result from a query - q.getSingleResult()
		
//		trainees.forEach(t->System.out.println(t));
		
//		tx.begin();
//		Mobile m1=new Mobile(451364, "Note 10", "Samsung", 78000);
//		Mobile m2=new Mobile(561384, "IPhone 11 Pro", "Apple", 121000);
//		Trainee t1=new Trainee(101,"Mahesh","mahesh@yahoo.com");
//		Trainee t2=new Trainee(102,"Ramesh","ramesh@yahoo.com");
//		t1.getMobiles().add(m1);
//		t1.getMobiles().add(m2);
//		t2.getMobiles().add(m1);
//		m1.getTrainees().add(t1);
//		m1.getTrainees().add(t2);
//		m2.getTrainees().add(t1);
//		em.persist(m1);
//		em.persist(m2);
//		em.persist(t1);
//	em.persist(t2);
//		
//		tx.commit();
		
		Trainee t1=em.find(Trainee.class, 101);
		System.out.println(t1);
		
	}
	
}
