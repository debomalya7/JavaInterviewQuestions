package com.interview;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = {12,34,-78,-990,856};
		
		int maximun = number[0];
		int minimum =number[0];
		
		for(int i=1; i<number.length; i++) {
			if(number[i]>maximun) {
				maximun = number[i];
			}
			else if (number[i]<minimum) {
				minimum =number[i];
			}
		}
		
		System.out.println("The gine array is :: "+Arrays.toString(number));
		System.out.println("Maximum number is "+maximun +" Minimum number is "+minimum);

	}

}
