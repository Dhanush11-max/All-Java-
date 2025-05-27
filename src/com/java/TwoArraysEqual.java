package com.java;

import java.util.Arrays;

public class TwoArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4};
		int B[]= {1,2,4,3};
		boolean Status = Arrays.equals(A, B);
		
		if (Status == true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
}
