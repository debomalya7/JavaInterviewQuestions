package com.interview;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int arr[] = {1,2,5,6,3,4,3,5,7,7};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate Number is :" +arr[j]);
				}
			}
		}
	}

}
