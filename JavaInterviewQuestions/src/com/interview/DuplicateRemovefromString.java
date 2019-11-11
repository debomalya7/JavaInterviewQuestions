package com.interview;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class DuplicateRemovefromString {
	
	public static void main(String[] args) {
		
		String s= "place of westminster place for";
		String [] arrs =s.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for (String string : arrs) {
			set.add(string);
		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	
		System.out.println();
	
	Map<String, Integer> map = new HashMap<String, Integer>();
	for (String mapEle : arrs) {
		Integer count =map.get(mapEle);
		if(count==null) {
			map.put(mapEle, 1);
		}
		else {
			map.put(mapEle,++count);
		}
	}
	
	Set<Entry<String,Integer>> entrySet = map.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println("Duplicate elements are : "+entry.getKey());
		}
	}
	}
}
