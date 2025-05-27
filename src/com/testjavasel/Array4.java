package com.testjavasel;

public class Array4 {

	public static void main(String[] args) {
		
		// Multi dai Array
		Object A[][]= {{1,2,3}, {4,5,6}, {7,8,9}};
		
		//No of Rows.
		int Row = A.length;
		System.out.println(Row);
		
		//No of columns.
		int Column = A[0].length;
		System.out.println(Column);
		
		//Print Array in Matrix form.
		for (int i = 0; i<Row; i++) {
			for (int j = 0; j<Column; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}
}
