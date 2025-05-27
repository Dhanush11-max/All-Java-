package com.testjavasel;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		String S = null;
		
		try {
			System.out.println(S.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exception Handled");
	}
}