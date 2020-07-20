package com.capg.demos;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> traineeBatchCode=new HashMap<>();
		
		traineeBatchCode.put("Manoj", 1);
		traineeBatchCode.put("Rahul", 3);
		traineeBatchCode.put("Suraj", 2);
		
		
		System.out.println(traineeBatchCode.get("Rahul"));
		
		traineeBatchCode.forEach((k,v)->System.out.println(k+" - "+v));
		
		for(String name:traineeBatchCode.keySet()) {
			System.out.println(name+" - "+traineeBatchCode.get(name));
		}
		
		
	}

}
