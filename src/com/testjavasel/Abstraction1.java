package com.testjavasel;

public abstract class Abstraction1 {

	static int a = 5; // Static Vari
	int b = 5; // Global Vari
	final int c = 10; // Final Vari

	// Abstract Method
	abstract void eat();

	// Non-Abstract Method
	public void a() {
		System.out.println("Non-Abstract Method");
	}
}
