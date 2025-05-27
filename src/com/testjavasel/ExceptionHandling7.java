package com.testjavasel;

public class ExceptionHandling7 {
	
	public static void a(int age) {
		
		try {
			if (age<18) {
			throw new ArithmeticException("Not Eligible !");
			}
			else {
				System.out.println("Eligible..!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException, ArithmeticException, Exception  {
		
		Thread.sleep(3000);
		a(12);//for this without try-catch = Only "Eligible" is printed
		a(19);
	}
}
