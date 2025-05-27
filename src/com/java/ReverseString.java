package com.java;

public class ReverseString {

	public static void main(String[] args) {
		String str = "!yrotS yM etirW-eR naC I";
		String org = str;
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		if (org.equals(rev)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Non-Palindrome String");
		}
	}
}
