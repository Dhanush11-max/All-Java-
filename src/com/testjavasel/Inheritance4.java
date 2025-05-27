package com.testjavasel;

public class Inheritance4 extends Inheritance3{
	
	public void multi(int x, int y) {
		z=x*y;
		System.out.println("multi is: "+ z);
	}
	public static void main(String args[]) {
		int x=20, y=10;
		Inheritance4 i4 = new Inheritance4();
		i4.add(x, y);
		i4.sub(x, 5);
		i4.multi(10, y);
	}

}
