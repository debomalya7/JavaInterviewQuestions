package com.interview;

public class RemoveJunkCharecter {
	
	public static void main(String[] args) {
		
		String s = "21t327871!!@&&#@*&jkbsfhbjb**";
		//regular expression(a-z,A-Z,0-9)
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
	}

}
