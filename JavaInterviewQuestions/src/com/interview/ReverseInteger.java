package com.interview;


public class ReverseInteger {
	
	public static void main(String[] args) {
		//1.using algorithm
		int num =12345;
		int reverse = 0;
		
		while(num !=0) {
			reverse = reverse * 10 + num % 10;
			num = num/10;			
		}
		System.out.println("reverse number :: "+reverse);
		
		//2.using string buffer
		int num1=12345;
		System.out.println("reverse is :: "+new StringBuffer(String.valueOf(num1)).reverse());
	}

}
