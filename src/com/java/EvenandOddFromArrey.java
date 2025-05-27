package com.java;

public class EvenandOddFromArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[] = {1,3,6,8,0,77,23,6457,9876,26,};
		for (int value : Arr) {
			if (value%2 == 0) {
				System.out.println("Even Number :" + value);
			}
			else {
				System.out.println("Odd Number :" + value);
			}
		}
	}
}