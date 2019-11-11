package com.interview;

public class SegrigateString {
	
	static void splitString(String str) {
		
		StringBuffer num = new StringBuffer(), alphabet = new StringBuffer(), spacialChar = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}
			else if (Character.isAlphabetic(str.charAt(i))) {
				alphabet.append(str.charAt(i));
			}
			else {
				spacialChar.append(str.charAt(i));
			}		
			
		}
		System.out.println("The numbers are : "+num);
		System.out.println("The Charecters are : "+alphabet);
		System.out.println("the spacial char are : "+spacialChar);
	
	}	
	public static void main(String[] args) {
		
		String str ="ray.debmalya7@gmail.com";
		splitString(str);
	}

}
