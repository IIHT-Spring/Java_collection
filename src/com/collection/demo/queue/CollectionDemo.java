package com.collection.demo.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CollectionDemo {
	public static void main(String[] args) {
		PriorityQueue<String> movieLine = new PriorityQueue<String>();
		movieLine.add("Ramesh");
		movieLine.add("Joyti");
		movieLine.add("Nikhil");
		movieLine.add("Akshay");
		movieLine.add("Vikram");
		movieLine.add("Shayam");
		System.out.println("Head: " + movieLine.element());
		System.out.println("peek: " + movieLine.peek());
		movieLine.remove("Ramesh");
		Iterator iMovieLine = movieLine.iterator();
		while(iMovieLine.hasNext()) {
			System.out.println(iMovieLine.next());
		}
		
	}

}
