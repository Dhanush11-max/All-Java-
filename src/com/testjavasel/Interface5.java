package com.testjavasel;

public class Interface5 extends Inheritance1 implements Interface3,Interface4{

	@Override
	public void b() {
		System.out.println("Method b");
	}

	@Override
	public void a() {
		System.out.println("Method a");
	}
	public static void main(String[] args) {
		Interface5 I5 = new Interface5();
		I5.a();
		I5.b();
		I5.methodA();
	}
}
