package com.interview;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//reverse a sting
		//difference between string and string buffer
		
		String string = "Selenium";
//		String reverse ="";
//		1.using for loop
//		for (int i = string.length()-1; i >= 0; i--) {
//			reverse =reverse + string.charAt(i);
//		}
//		
//		System.out.println(reverse);
//	}
//      2. using string buffer
		StringBuffer sfBuffer =new StringBuffer(string);
		StringBuffer reverse = sfBuffer.reverse();
		
		System.out.println(reverse);
}
}