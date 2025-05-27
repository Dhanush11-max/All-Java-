package com.testjavasel;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG6 {

	@Test
	public void z() {
		Assert.assertTrue(5<10);
		System.out.println("Test z method");
	}
	
	@Test
	public void a() {
		Assert.assertFalse(90<10);
		System.out.println("Test a method");
	}
	
	@Test(dependsOnMethods = {"z", "a"})
	public void b() {
		System.out.println("Test b method");
	}
	
}
