package com.java;

public class ReverseStringUsingCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "!gniniggeB ehT sI dnE";
		char ch[] = str.toCharArray();
		int len = str.length();
		
		for (int i = len-1; i>=0 ; i--) {
			
			System.out.print(ch[i]);
		}
	}
}