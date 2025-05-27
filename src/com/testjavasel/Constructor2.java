package com.testjavasel;

public class Constructor2 {

	int id;
	String name;
	String Address;

	// Default Constructor
	Constructor2() {
		System.out.println("Hello Default Constructor");
	}

	// Parameterized Constructor
	Constructor2(int a, String b, String c) {
		this.id = a;
		name = b;
		Address = c;
	}

	// Non-Static method
	public void info() {
		System.out.println(id + " " + name + " " + Address);
	}

	public static void main(String[] args) {
		// Default Constructor
		Constructor2 C2 = new Constructor2();

		// Parameterized Constructor
		Constructor2 C3 = new Constructor2(1, "Dinesh", "Pandharpur");
		C3.info();
		Constructor2 C4 = new Constructor2(2, "Ganesh", "Kolhapur");
		C4.info();
	}
}
