package com.testjavasel;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> Ht = new Hashtable<Integer, String>();
		
		Ht.put(1, "Mau");
		Ht.put(2, "Ak");
		Ht.put(3, "Dinesh");
		
		System.out.println(Ht.get(3));
		System.out.println(Ht.get(1));
		System.out.println(Ht);
	}

}
