package com.testjavasel;

public class Interface2 implements Interface1{

	public static void main(String[] args) {
		Interface2 I2 = new Interface2();
		I2.A();
		I2.B();
	}

	@Override
	public void A() {
		System.out.println("Method A");
	}

	@Override
	public void B() {
		System.out.println("Method B");
	}

}
