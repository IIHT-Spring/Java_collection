package com.collection.demo.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> Employee = new LinkedList<String>(); // create my linked list
		
		Employee.add("Nishant");
		Employee.add("Vijay");
		Employee.add("kunal");
		Employee.add("Rohan");
	
		Employee.addFirst("Ashneer"); // add to first element
		Employee.addLast("Bill"); // this add to last element
		//Employee.removeAll(Employee); // remove everything
		Employee.removeFirstOccurrence("Vijay"); // to remove first poccarance
		Employee.removeLastOccurrence("Bill"); // remove  last ocorance
		
		
		System.out.println(Employee);
	
	}

}
