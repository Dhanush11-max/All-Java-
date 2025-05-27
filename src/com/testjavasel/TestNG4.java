package com.testjavasel;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	//For skipping test cases:
	
	// 1st way--> By commenting the @Test annotation [eg. a() method]
	//@Test 
	public void a() {
		System.out.println("Hello a test method");
	}
	@Test(enabled = true)
	public void b() {
		System.out.println("Hello b test method");
	}
	// 2nd way(Widely used in market)--> By mentioning "(enabled = false)" in front of @Test annotation
	// if we mention "(enabled = true)" or nothing in front of @Test annotation, then test case is executed
	@Test(enabled = false)
	public void c() {
		System.out.println("Hello c test method");
	}
	// 3rd way--> By mentioning "(invocationCount = 0)" in front of @Test annotation
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("Hello d test method");
	}
	// if we mention "(invocationCount = 3)" then test case is executed 3 times like wise
	@Test (invocationCount = 3)
	public void e() {
		System.out.println("Hello e test method");
	}
	// 4th way-->By mentioning "throw new SkipException("Test method f is skipped")" in the test method body
	// In above comment "Test method f is skipped" is the 'skip Message'
	// Only this way(4th way) we can get the skips test cases number
	@Test
	public void f() {
		System.out.println("Hello f test method");
		throw new SkipException("Test method f is skipped");
	}
}
