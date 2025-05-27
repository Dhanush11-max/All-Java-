package com.java;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < A.length; i++) {
			sum1 = sum1 + A[i];
		}
		for (int i = 0; i <= 10; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of the element array: " + sum1);
		System.out.println("Sum of range of element: " + sum2);
		System.out.println("Missing Number: " + (sum2 - sum1));
	}
}