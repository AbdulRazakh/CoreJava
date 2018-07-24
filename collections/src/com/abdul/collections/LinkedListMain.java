package com.abdul.collections;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		System.out.println("linkedList after add"+linkedList);
		
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("linked list after remove"+linkedList);
		
		// assign to new  linkedlist
		
		LinkedList<Integer> linkedList2=new LinkedList<Integer>(linkedList);
		
		
		System.out.println("Linked List with copy"+linkedList2);
		Object[] objarray=linkedList2.toArray();
		
		for(Object obj:objarray){
			System.out.println("obj.........."+obj);
		}
	}

}
/*output
 * linkedList after add[1, 2, 3, 4, 5, 6]
linked list after remove[2, 3, 4, 5]
Linked List with copy[2, 3, 4, 5]
obj..........2
obj..........3
obj..........4
obj..........5

LinkedList internally implements doubly linked list 
duplicate elements are allowed 
order of elements are maintained 

  
 * */
