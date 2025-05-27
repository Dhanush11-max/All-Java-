package com.testjavasel;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		
		try {
		
		int i = 7/0;
		
		}
		catch (ArithmeticException A) {
			A.printStackTrace(); // print complete exception info
			System.out.println(A); // print only exception info
		}
		catch (NullPointerException N) {
			N.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException AO) {
			AO.printStackTrace();
		}
		// when we handle exception by directly "Exception" then no need to add any other exception
		catch (Exception E) {
			E.printStackTrace();
		}
		System.out.println("Exception Handeled");
	}
}