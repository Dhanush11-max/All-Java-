package com.testjavasel;

public class Inheritance7 extends Inheritance6{
	
	public void eat() {
		System.out.println("I am Eating");
	}
	public static void main(String args[]) {
		Inheritance7 i7 = new Inheritance7();
		i7.write();
		i7.read();
		i7.eat();
	}

}
