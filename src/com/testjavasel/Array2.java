package com.testjavasel;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,2,3,4,5,6,7,8,9};
		String S[] = {"Hi", "Hello", "Thanks"};
		Object O[] = {"Me", 5<7 , 100};
		
		System.out.println(O[1]);
		System.out.println(S[2]);
		System.out.println(A[6]);
		
		O[2] = "Sorry";
		System.out.println(O[2]);
	}

}
