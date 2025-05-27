package com.testjavasel;

public class ExceptionHandling4 {

	public static void main(String[] args) {

		int A[] = new int[5];

		// We are created array of 5 units and try to assign 7th index
		try {

			A[7] = 40;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception Handled");
	}

}
