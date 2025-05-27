package com.testjavasel;

public class MeOvRide7 {

	public static void main(String[] args) {
		MeOvRide5 mov5 = new MeOvRide6();
		mov5.cook();
		mov5.eat();
		// mov5.angry();//shows undefined as this method is not present in parent class(MeOvRide5)
	}

}
