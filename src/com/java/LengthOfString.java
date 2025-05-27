package com.java;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 120034;
		int len = 0;
		
		while (x != 0) {
			
			x = x/10;
			len++;
		}
		System.out.println(len);
	}
}
    