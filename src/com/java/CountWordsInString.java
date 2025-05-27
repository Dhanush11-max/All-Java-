package com.java;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I can Re-write my story";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Total words in the given string = "+count);
	}
}