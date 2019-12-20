package com.interview;

public class Exceptionhierarchy {

	public static void main(String[] args) {
		division();
		
	}
	
	public static void division() {
		int i=10;
		try {
			System.out.println("inside try block");
			int k =i/0;
		} catch (NullPointerException e) {
			System.out.println("inside catch block");
			System.exit(0);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("inside catch 1 block");
		}
		finally {
			System.out.println("inside finally block");
		}
	}


}
