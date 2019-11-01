package com.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// remove duplicate from unsorted array 

public class DuplicateRemoval {
	
	public static void main(String[] args) {
		
		String names[] = {"java","c","java","python", "javascript", "ruby", "perl","c"};
		
		//using HashSet
		
		Set<String> set = new HashSet<String>();
		for (String name : names) {
			if(set.add(name)== false) {
				System.out.println("the duplicate element is :: "+name);
			}
		}
		
		
		//using hashMap
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String name : names) {
			Integer count = map.get(name);
			if(count == null) {
				map.put(name, 1);
			}
			else {
				map.put(name, ++count);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("The duplicate element is ::" +entry.getKey());
			}
		}
 		
	}

}
