package com.testjavasel;

public class AccessModifier1 {

	private int i =100;
	int b = 10;
	public int c =98;
	//if we not mentioned any access modifier then by-default it will take as 'default'
	
	public void test() {
		System.out.println("Private Test");
	}
}