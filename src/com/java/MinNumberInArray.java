package com.java;

public class MinNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 5, 2, 90, 435, 88 };
		int Min = A[0];

		for (int i = 1; i < A.length; i++) {
			if (A[i] < Min) {
				Min = A[i];
			}
		}
		System.out.println("Min number in Array is: " + Min);
	}
}