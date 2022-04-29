package com.collection.demo.hashset;

import java.util.TreeSet;

public class LinkedHashSet {
	public static void main(String[] args) {
		TreeSet<Integer> Roll = new TreeSet<Integer>();
		Roll.add(12);
		Roll.add(22);
		Roll.add(42);
		Roll.add(15);
		Roll.add(12);
		System.out.println(Roll);
		System.out.println("Highest : " + Roll.pollFirst());
		System.out.println("lowest : " + Roll.pollLast());
		
		
		TreeSet<String> fruits = new TreeSet<String>();
		fruits.add("Mango");
		fruits.add("Watermelon");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Pineapple");
		
		System.out.println(fruits);
		
		// for decending order 
		System.out.println("Reverse set: " + fruits.descendingSet());
		// for head set
		System.out.println("HeadSet: " + fruits.headSet("Orange", true));
		
		System.out.println("Subset: " + fruits.subSet("Orange", false, "Pineapple", true));
		
		System.out.println("Tailset: " +  fruits.tailSet("Orange", false));
	

	}
}
