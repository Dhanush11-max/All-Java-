package com.testjavasel;

public class Encapsulation2 extends Encapsulation1{
	
	// Final method cannot be Override
	/*final void f() {
		System.out.println("Final Method");
	}*/	

	public static void main(String[] args) {
		Encapsulation2 E2 = new Encapsulation2();
		E2.setName("Attitude");
		System.out.println(E2.getName());
	}

}
