package com.java;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Attitude";
		int len = str.length();
		char ch[] = str.toCharArray();
		boolean flag = false;
		int count = 0;
		
		for (int i = 0; i<len; i++) {
			for (int j = i+1; j<len; j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate character: "+ ch[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Not found duplicate character");
		}
	} 
} 