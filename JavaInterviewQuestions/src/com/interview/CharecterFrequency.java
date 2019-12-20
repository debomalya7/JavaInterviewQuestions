package com.interview;

import java.util.concurrent.CountDownLatch;

public class CharecterFrequency {
	
	public static void main(String[] args) {
		
		String str = "Engineering";
		char c[] =str.toCharArray();
		int size = str.length();
		int i=0, j=0 ,Count =0;
		
		for(i=0;i<size;++i) {
			Count=0;
			for(j=0;j<size;++j) {
				
				if(j<i && c[i]==c[j]) {
					break;
				}
				
				if(c[j]==c[i]) {
					Count++;
				}
				if(j==size-1){
					System.out.println("The charecter "+c[i]+ " is present "+Count+" number of times");
				}
			}
			
		}
	}

}
