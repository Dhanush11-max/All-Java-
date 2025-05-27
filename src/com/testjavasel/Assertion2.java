package com.testjavasel;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertion2 {

	@Test
	public void testCase2() {

		String Expected = "Dinesh";
		String Actual = "Dinesh";

		int A = 10;
		int B = 20;

		// Equal Assertion--> We also can print customized message (eg. "Expected & Actual are not matching")
		Assert.assertEquals(Expected, Actual);
		System.out.println("Equal Assertion PASS");
		
		// False Assertion
		Assert.assertFalse(A > B);
		System.out.println("False Assertion PASS");
		
		// True Assertion
		Assert.assertTrue(A > B);
		// Assertion failed, execution stopped and further line of code is not executed 
		System.out.println("True Assertion PASS");
	}
	
	@Test
	public void testCase3() {
		
		// Assertion is written in testCase2() method & scope is also for that method only
		System.out.println("Hello testCase3() method");
	}
}
