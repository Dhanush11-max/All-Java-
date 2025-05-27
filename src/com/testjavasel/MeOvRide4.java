package com.testjavasel;

public class MeOvRide4 extends MeOvRide3{

	public void run() {
		System.out.println("You are running");
	}
	public static void main(String[] args) {
		MeOvRide4 mov4 = new MeOvRide4();
		mov4.run();
		
		MeOvRide3 mov3 = new MeOvRide3();
		mov3.run();
	}
}

