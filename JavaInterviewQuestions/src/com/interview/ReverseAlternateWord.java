package com.interview;

import java.util.Scanner;

public class ReverseAlternateWord {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String string =sc.nextLine();
		
		String words[] =string.split(" ");
		for(int i=0;i<words.length;i++) {
			if(i%2==0) {
				words[i]=new StringBuffer(words[i]).reverse().toString();
			}
		}
		
		StringBuffer reverse = new StringBuffer();
		for (String str : words) {
			reverse.append(str+" ");
		}
		System.out.println("Output : "+reverse);
	}

}
