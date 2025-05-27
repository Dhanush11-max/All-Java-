package com.testjavasel;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		String S = "Selenium";
		
		try {
			int i = Integer.parseInt(S);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exception Handled");
	}
}
