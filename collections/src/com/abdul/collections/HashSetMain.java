package com.abdul.collections;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		
		
		HashSet<String > hashSet=new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("U");
		hashSet.add("L");
		System.out.println("hashSet after adding"+hashSet);
		hashSet.remove("U");
		System.out.println("hashSet after removing"+hashSet);
		HashSet<String > hashSet2=new HashSet<String>();
		hashSet2.add("MB");
		hashSet2.add("GB");
		//no duplicates 
		hashSet2.add("GB");
		
		System.out.println("hashSet2"+hashSet2);
		hashSet2.addAll(hashSet);
		//no ordering 
		System.out.println("hashSet2 after addAll"+hashSet2);
	}

}
/*hashSet after adding[A, B, D, U, L]
hashSet after removing[A, B, D, L]
hashSet2[MB, GB]
hashSet2 after addAll[A, B, D, MB, GB, L]

Hashset implements set interface
hashset doesnt allow duplicate elements 
order of elements is not maintained 
adding or deleting an element will take the same time
hashset is not synchronized and hence it is not thread safe



*/