package com.java;

public class MaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 10, 509, 30, 79, 24, 76, 9 };
		int Max = A[0];

		for (int i = 1; i < A.length; i++) {
			if (A[i] > Max) {
				Max = A[i];
			}
		}
		System.out.println("Max number in Array is: " + Max);
	}
}