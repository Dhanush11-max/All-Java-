package com.testjavasel;

public class MeOvLoad1 {
	//same method name & type of parameter but different no of parameters

	public void add(int x,int y) {
		System.out.println(x+y);
	}
	public void add(int x,int y, int z) {
		System.out.println(x+y+z);
	}
}
