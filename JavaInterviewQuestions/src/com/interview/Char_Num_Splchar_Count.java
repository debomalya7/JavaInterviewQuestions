package com.interview;

import java.util.Scanner;

public class Char_Num_Splchar_Count {
	
	public static void main(String[] args) {
		System.out.println("Enter a word containing letters, numbers and spacial cherecter : ");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		int upper=0,lower=0,spacial=0,number=0;
		for(int i=0;i<string.length();i++) {
			char ch =string.charAt(i);
			if(ch>= 'A' && ch<='Z') {
				upper++;
			}else if (ch>='a' && ch<='z') {
				lower++;
			}
			else if (ch>='0' && ch<='9') {
				number++;
			}
			else {
				spacial++;
			}
		}
		
		System.out.println("Upper case : "+upper +" lower case : "+lower+" spacial charecter : "+spacial + " numbers: "+number);
	}

}
