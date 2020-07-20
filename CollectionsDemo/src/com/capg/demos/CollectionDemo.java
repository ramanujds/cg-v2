package com.capg.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
//			List trainees= new ArrayList();
//			
//			trainees.add("Manoj");
//			trainees.add("Praneet");
//			trainees.add("Sindhu");
//			trainees.add(10);
//			trainees.add(true);
//			
//			trainees.add(1,"Rahul");
//			
//			trainees.remove((Object)10);
//			
//			for(Object trainee:trainees) {
//				System.out.println(trainee);
//			}
		
		
//		Set<String> trainees=new TreeSet<>();
//		
//		trainees.add("Manoj");
//		trainees.add("Praneet");
//		trainees.add("Sindhu");
//		trainees.add("Gaurav");
//
//		trainees.add("Sindhu");
//		
//			
//		trainees.forEach(System.out::println);
		
		
		List<Trainee> trainees=Arrays.asList(
				new Trainee("Mahesh","Batch 3",22),
				new Trainee("Rahul","Batch 1",23),
				new Trainee("Harsh","Batch 2",25),
				new Trainee("Rahul","Batch 1",23)
				);
		
		Set<Trainee> traineeSet=new HashSet<>(trainees);
		
		System.out.println("Trainee Set - ");
		traineeSet.forEach(t->System.out.println(t));
		
		Collections.sort(trainees,(t1,t2)->t1.tName.compareTo(t2.tName));
		System.out.println();
		System.out.println("Trainee List - ");
		trainees.forEach(t->System.out.println(t));
				
		
		
		
	}

}

//class SortByAge implements Comparator<Trainee>{
//	@Override
//	public int compare(Trainee t1, Trainee t2) {
//		return t1.age-t2.age;
//	}
//}
//
//class SortByName implements Comparator<Trainee>{
//	@Override
//	public int compare(Trainee t1, Trainee t2) {
//		return t1.tName.compareTo(t2.tName);
//	}
//}
//
//class SortByBatch implements Comparator<Trainee>{
//	@Override
//	public int compare(Trainee t1, Trainee t2) {
//		return t1.batchName.compareTo(t2.batchName);
//	}
//}
