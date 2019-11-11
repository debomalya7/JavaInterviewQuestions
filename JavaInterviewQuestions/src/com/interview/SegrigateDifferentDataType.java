package com.interview;

public class SegrigateDifferentDataType {
	public static void main(String[] args) {
		String string = "ray.debmalya7@gmail.com";
		
		StringBuffer number = new StringBuffer();
		StringBuffer alpha  = new StringBuffer();
		StringBuffer spacialCharecter  = new StringBuffer();
		
		for(int i = 0; i<string.length();i++) {
			if(Character.isAlphabetic(string.charAt(i))) {
				alpha.append(string.charAt(i));
			}
			else if (Character.isDigit(string.charAt(i))) {
				number.append(string.charAt(i));
			}
			else {
				spacialCharecter.append(string.charAt(i));
			}
		}
		
		System.out.println("The charecters presents are  : "+alpha);
		System.out.println("The numbers presets are : "+number );
		System.out.println("The soacial charecter presents are : "+spacialCharecter);
	}

}
