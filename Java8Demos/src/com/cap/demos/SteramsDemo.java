package com.cap.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteramsDemo {
	public static void main(String[] args) {
		
		//Stream<Integer> nums=Stream.of(5,1,2,3,6,8);
		
		List<Integer> items=Arrays.asList(5,1,2,3,6,8);
		
//		List<Integer> evens=new ArrayList<>();
//		for(int i:items) {
//			if(i%2==0) {
//				evens.add(i);
//			}
//		}
//		
//		System.out.println(evens);
//		int sum=0;
//		for(int e:evens) {
//			sum+=e*e;
//		}
//		
//		System.out.println("Sum = "+sum);
		
		List<Integer> nums=items.stream()
								.filter(i->i%2==0)
								.map(i->i*i)
								.collect(Collectors.toList());
		System.out.println(nums);
		//System.out.println("Sum = "+sum);
	}

}
