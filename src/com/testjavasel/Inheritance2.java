package com.testjavasel;

public class Inheritance2 extends Inheritance1 {

	int p = 10;
	static int r = 20;

	public void q() {
		System.out.println("Method-q");
	}

	public static void s() {
		System.out.println("Method-s");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance1 i1 = new Inheritance1();
		Inheritance2 i2 = new Inheritance2();

		System.out.println(i1.I1);
		i1.methodA();

		System.out.println(r);
		System.out.println(i2.p);
		s();
		i2.q();

	}
}