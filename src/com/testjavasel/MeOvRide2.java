package com.testjavasel;

public class MeOvRide2 extends MeOvRide1{
	
	public void eat() {
		System.out.println("You are eating");
	}
	public static void main(String[] args) {
		MeOvRide2 mo2 = new MeOvRide2();
		mo2.eat();
	}

}
