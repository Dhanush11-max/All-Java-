package com.java;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"Dinesh", "Ganesh", "Maya", "Saya"};
		String Search = "Dinesh";
		boolean flas=false;
		
		for (int i =0; i<str.length; i++) {
			if (Search == str[i]) {
				System.out.println("Search Found: "+ str[i]);
				flas = true;
				break;
			}
		}
		if(flas == false) {
			System.out.println("Search Not Found");
		}
	}
}
