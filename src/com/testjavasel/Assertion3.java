package com.testjavasel;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertion3 {

	@Test
	public void testCase2() {

		String Expected = "Dinesh";
		String Actual = "Dinessh";

		// Equal Assertion
		try {
			Assert.assertEquals(Expected, Actual);
		} catch (Error e) {
			e.printStackTrace();
		}
		System.out.println("Equal Assertion PASS");
		
	}
}
