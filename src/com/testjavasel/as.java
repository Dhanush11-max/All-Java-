package com.testjavasel;

public class as {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int target = 5;
		int pair = 0;
		int len = a.length;

		for(int i=0; i<=len-1;i++){
			for(int j =i+1; j<=len-1;j++) {
		  
		 if(target==(a[i]+a[j])){

		pair++;
		}
		}
	}
		 System.out.println(pair);
	}}