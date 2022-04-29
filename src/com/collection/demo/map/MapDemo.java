package com.collection.demo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> employee = new HashMap<>();
		// adding elemnets to the map
		employee.put(1, "Nishant");
		employee.put(22, "Susan");
		employee.put(3, "Smita");
		employee.put(4, "Rajeev");
		employee.put(5, "Kishan");

		// return a set view of the mapping contained in this map 
		//employee.entrySet();
		
		//to sort according to the provided comparator
		employee.sorted(Map.Entry.comparingByKey());
		// to return a sequential stream 
//		employee.stream()
		
		// transversing the map
//		Set set = employee.entrySet();
//		Iterator iEmployee = set.iterator();

		for (Map.Entry m : employee.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
	}

	}

}
