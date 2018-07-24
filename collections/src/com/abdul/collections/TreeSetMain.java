package com.abdul.collections;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(5);
		treeSet.add(4);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		System.out.println("tree set....."+treeSet);
	}

}
/*output
  tree set.....[1, 2, 3, 4, 5]
it doesnt allow duplicates 
and by default it stores elements in ascending order

   *
   */
 