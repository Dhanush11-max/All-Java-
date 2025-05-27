package com.testjavasel;

import org.testng.annotations.Test;

public class TestNG3 {

	// Always executed lowest priority Test case first ( first all -ve, then 0 and no priority, then +ve )
	// 0 and no priority means same --> in this case alpha-numeric order is followed if there test case with 0 an no priority is present
	
	@Test(priority = -2)
	public void c() {
		System.out.println("Hello c method");
	}
	@Test(priority = 0)
	public void d() {
		System.out.println("Hello d method");
	}
	@Test
	public void a() {
		System.out.println("Hello a method");
	}
	@Test(priority = 3)
	public void b() {
		System.out.println("Hello b method");
	}
	@Test(priority = 1)
	public void e() {
		System.out.println("Hello e method");
	}
}
