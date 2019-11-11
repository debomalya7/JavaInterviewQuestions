package com.interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateWordUsingMap {
	public static void main(String[] args) {
		
		//input ="I am am debo debo ";
		//output ="I am debo
		
		String input = "I am am debo debo";
		
		String[] inputArr =input.split(" ");
		
		Set<String> mySet = new HashSet<String>();
		
		for(String x : inputArr) {
			
			mySet.add(x);
		}
		
		Iterator itr = mySet.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
