package com.java;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;
		int B = 25;
		
		System.out.println("Before Swapping: "+A + " " +B);
		
		A = A+B;
		B = A-B;
		A = A-B;
		
		System.out.println("After Swapping : "+A + " " +B);
	}
}