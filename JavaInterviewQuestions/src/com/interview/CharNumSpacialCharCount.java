package com.interview;

public class CharNumSpacialCharCount {
	
	public static void main(String[] args) {
		
		String str ="ABshfkjh@@082jgjd";
		int upper=0, lower=0, number=0, spcl=0 ;
		
		for(int i=0; i< str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch>= 'A' && ch<='Z')
				upper++;
			else if (ch>= 'a' && ch<= 'z') 
				lower++;
			else if (ch>='0' && ch <= '9') 
				number++;
			else 
				spcl++;	
		}
		
		System.out.println("The number of Upper Case : "+upper);
		System.out.println("The number of Lower case : "+lower);
		System.out.println("The number of Numeric charecter : "+number);
		System.out.println("The number of Spacial Charecters : "+spcl);
	}
	


}
