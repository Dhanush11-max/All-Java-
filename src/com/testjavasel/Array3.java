package com.testjavasel;

public class Array3 {
	
	static int A [] = {27,73,21,64,94};

	public static void passingarrayToMethod() {
		
		int B = A[3];
		
		for (int i=0; i<A.length;i++) {
			
			if (B<=A[i]) {
				System.out.println(B);
			}
			else {
				System.out.println("false");
			}
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passingarrayToMethod();

	}

}
