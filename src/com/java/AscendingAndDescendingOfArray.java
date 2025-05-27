package com.java;

import java.util.Arrays;

public class AscendingAndDescendingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {10,1,2,4,5,6,7,3,8,9};
		String str[] = {"Dinesh","Love","Maya","Beautiful","Atractive","Beauty"};
	
		System.out.println("Array before sort: "+ Arrays.toString(A));
		Arrays.sort(A);
		System.out.println("Array after sort: "+ Arrays.toString(A));
		
		System.out.println("Array before sort: "+ Arrays.toString(str));
		Arrays.sort(str);;
		System.out.println("Array after sort: "+ Arrays.toString(str));
	}
}