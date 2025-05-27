package com.testjavasel;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		
		try {
			int i = 10/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// finally block always executed, weather the exception is handled or not
		finally {
			System.out.println("Finally will always Exicuted");
		}
		
	}

}
