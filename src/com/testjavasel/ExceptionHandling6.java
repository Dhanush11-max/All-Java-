package com.testjavasel;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		try {
			int i = 20 / 2;
		} finally {

			System.out.println("Finally will always exicuted");

			try {
				int a = 10 / 0;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("Exception Handled");
	}

}
