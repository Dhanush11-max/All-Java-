
package com.testjavasel;

public class AccessModifier2 extends AccessModifier1{

	public static void main(String[] args) {
		
		AccessModifier2 A2 = new AccessModifier2();
		
		//System.out.println(A2.i);
		//private members are not accessed in another class
		
		System.out.println(A2.b);
		//as b is not specified with any of the access modifier hence it considered as 'default'
		
		System.out.println(A2.c);
		//as c is public accessed from everywhere
	}

}
