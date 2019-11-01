package com.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicateWordArray {
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("a");
		
		System.out.println(al);
		
		for(String tempString : al) {
			System.out.println(tempString);
		}
		
		Set<String> set = new HashSet<String>();
		
		for(String temp: set) {
			System.out.println(temp);
		}
		


		
		
	}

}
