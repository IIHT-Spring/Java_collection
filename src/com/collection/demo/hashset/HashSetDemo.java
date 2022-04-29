package com.collection.demo.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> RegNo = new HashSet<>();
		RegNo.add("R16762");
		RegNo.add("R16763");
		RegNo.add("R16764");
		RegNo.add("R16764");
		RegNo.add("R16764");
		RegNo.add("R16764");
		RegNo.add("R16765");
		RegNo.add("R16766");
		RegNo.add("R16767");
		
		Iterator<String> iRegNo = RegNo.iterator();
		
		while(iRegNo.hasNext()) {
			System.out.println(iRegNo.next());
		}
	}

}
