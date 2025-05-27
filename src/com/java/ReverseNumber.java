package com.java;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123456789;
		int org = x;
		int rem = 0;
		int rev = 0;
		
		while (x!=0) {
			rem = x%10;
			rev = rev*10+rem;
			x=x/10;
		}
		System.out.println(rev);
	    if(org == rev) {
	    	System.out.println("Palindrome Number");
	    }
	    else {
	    	System.out.println("Non-Palindrome Number");
	    }
}
}
