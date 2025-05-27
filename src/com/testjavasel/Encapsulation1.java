
package com.testjavasel;

public class Encapsulation1 {
	String name; //global vari
	int b; //global vari
	final int c=10; //final vari
	
	public void a() {
		//c=20; // Value of final vari can-not be changed
	}
	
	final void f() {
		System.out.println("Final Method");
	}
	public void setName(String s) {
		this.name=s;
		this.b=5;
		System.out.println(b);//5
		System.out.println(c);//10
	}
	public String getName() {
		return name;
	}
}