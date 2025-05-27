package com.testjavasel;

public class Abstraction2 extends Abstraction1{

	public static void main(String[] args) {
		Abstraction2 A2 = new Abstraction2();
		A2.eat();
		A2.a();
	}
	void eat() {
		System.out.println("Please Eat Fast");
	}

}
