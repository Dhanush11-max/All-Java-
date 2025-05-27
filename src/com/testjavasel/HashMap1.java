package com.testjavasel;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> Hm = new HashMap<Integer,String>();
		
		//left side = Key & Right side = Values
		//Mapping values with the key
		Hm.put(1, "Dinesh");
		Hm.put(2, "Manu");
		Hm.put(3, "Maya");
		
		//Printing values associated with the keys
		System.out.println(Hm.get(1));
		System.out.println(Hm.get(3));
		
		//Printing all values with key
		System.out.println(Hm);
	}

}
