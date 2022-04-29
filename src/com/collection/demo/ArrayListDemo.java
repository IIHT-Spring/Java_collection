package com.collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> Student = new ArrayList<String>(); // to create an array list 
		Student.add("Nishant");
		Student.add("AKshay");
		Student.add("Ramesh");
		Student.add(2, "Peter");
		Student.add("Binay");
		Student.add("Kunal");
		Student.add("Sourav");
		//sort an array 
	//	Collections.sort(Student); // sort a string
		ArrayList<Integer> Roll = new ArrayList<Integer>();
		Roll.add(12);
		Roll.add(23);
		Roll.add(11);
		Roll.add(54);
		Roll.add(2);
		Roll.add(5);
		Roll.add(32);
		Collections.sort(Roll); // sort int
		System.out.println(Roll);
		Roll.remove(3);
		System.out.println(Roll);
		
		Iterator studentItr = Student.iterator();
//		Student.set(2, "Suresh");
//		System.out.println( "Class topper is " + Student.get(2)); 
// how you will use get method to access any single index of the list
		while(studentItr.hasNext()) {
			System.out.println(studentItr.next());
		}
	}

}
