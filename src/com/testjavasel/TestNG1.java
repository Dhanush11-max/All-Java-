package com.testjavasel;

import org.testng.annotations.*;

public class TestNG1 {

	@BeforeTest
	public void d(){
		System.out.println("Hello d method");
	}
	
	@AfterClass
	public void f() {
		System.out.println("Hello f method");
	}
	
	@AfterMethod
	public void e() {
		System.out.println("Hello e method");
	}
	
	@AfterTest
	public void c() {
		System.out.println("Hello c method");
	}
	
	@BeforeClass
	public void b() {
		System.out.println("Hello b method");
	}
	
	@BeforeMethod
	public void g() {
		System.out.println("Hello g method");
	}
	
	@Test
	public void t1() {
		System.out.println("Hello t1 test method");
	}
	
	@AfterSuite
	public void h() {
		System.out.println("Hello h method");
	}
	
	@Test
	public void T1() {
		System.out.println("Hello T1 test method");
	}
	
	@Test
	public void A() {
		System.out.println("Hello A test method");
	}
	
	@BeforeSuite
	public void i() {
		System.out.println("Hello i method");
	}
	
	@Test
	public void T() {
		System.out.println("Hello T  Test method");
	}
	
	
	
	
	
	
}
