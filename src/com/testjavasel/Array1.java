package com.testjavasel;

public class Array1 {

	public static void main(String[] args) {
		
		// Declaring an Array
		int a[] = new int  [5];
		
		// length of array
		System.out.println(a.length);
		
		// Assigning Values
			a[0]=90;
			a[1]=99;
			a[2]=62;
			a[3]=65;
			a[4]=11;
			
			for (int i=0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
	}

