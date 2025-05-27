package com.testjavasel;

public class Constructor3 {

	// Constructor Overloading
	Constructor3() {
		System.out.println("No parameter");
	}

	Constructor3(int a) {
		System.out.println("int parameter");
	}

	Constructor3(String s) {
		System.out.println("String parameter");
	}

	public static void main(String[] args) {
		Constructor3 C3 = new Constructor3();
		Constructor3 C4 = new Constructor3(7);
		Constructor3 C5 = new Constructor3("Allow");
	}
}
