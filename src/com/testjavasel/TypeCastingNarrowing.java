package com.testjavasel;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		
		double b = 9.9;
		int a = (int)b;
		
		System.out.println(a);
		System.out.println(b);
		
		//String to int
		String s = "30";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		//int to String
		int d = 100;
		String g = String.valueOf(d);
		String f = String.valueOf(d);
		System.out.println(g.length());
	}

}
