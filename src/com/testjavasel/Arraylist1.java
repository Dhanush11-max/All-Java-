package com.testjavasel;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		// Creating ArrayList of Object type
		ArrayList<Object> obj = new ArrayList<Object>();
		
		// Adding elements to the ArrayList of Object type
		obj.add(1);
		obj.add('T');
		obj.add(3<5);
		obj.add("Butterfly");
		obj.add(9.0);
		
		// Printing elements - 1st way -Passing reference variable
		System.out.println(obj);
		
		// Printing elements - 2nd way -Using for each loop
		for(Object ArList:obj) {
			System.out.println("By for loop: "+ ArList);
			
		// Printing elements - 3rd way -Using Iterator & while loop
		Iterator Array = obj.iterator();
		while(Array.hasNext()) {
			System.out.println("By while loop: "+ Array.next());
		}
		}
	}
}