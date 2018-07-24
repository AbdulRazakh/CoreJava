package com.abdul.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {

	public static void main(String[] args) {

	
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
		
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		linkedHashSet.add(4);
		linkedHashSet.add(5);
		System.out.println("linkedHashSet after addition"+linkedHashSet);
		
		LinkedHashSet<Integer> linkedHashSetSecound=new LinkedHashSet<Integer>();
			linkedHashSetSecound.add(21);
			linkedHashSetSecound.add(52);
System.out.println("linkedHashSetSecound after adding "+linkedHashSetSecound);
		linkedHashSet.addAll(linkedHashSetSecound);
		
		System.out.println("linkedHashSet after addAll "+linkedHashSet);
	}

}
/*output*/
/*linkedHashSet after addition[1, 2, 3, 4, 5]
linkedHashSetSecound after adding [21, 52]
linkedHashSet after addAll [1, 2, 3, 4, 5, 21, 52]

LinkedHashSet class implements HashSet class 
it doesnt allow duplicates 
insertion order is maintained 



*/