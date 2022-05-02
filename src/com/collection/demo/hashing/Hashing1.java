package com.collection.demo.hashing;
import java.util.*;
public class Hashing1 {
	public static void main(String[] args) {
		Hashtable<Integer, String> students = new Hashtable<Integer, String>();
		
		students.put(65, "Nishant");
		students.put(12, "Abhay");
		students.put(43, "Vikram");
		students.put(98, "Kapil");
		students.put(01, "Peter");
		
		System.out.println(students);
		
	}

}
