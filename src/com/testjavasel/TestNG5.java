package com.testjavasel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG5 {

	@Test
	public void a() {
		System.out.println("Hello a Test Method");
	}
	// For method b(), we mention 'enabled = false & true'
	// Here--> & is bitwise operator hence 'false & true' becomes 'false' therefore this method is skipped
	@Test(invocationCount = 2, priority = -1, enabled = false & true)
	public void b(){
		System.out.println("Hello b test method");
	}
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("hello c test method");
	}
	@BeforeMethod
	public void d() {
		System.out.println("Hello d test method");
	}
}
