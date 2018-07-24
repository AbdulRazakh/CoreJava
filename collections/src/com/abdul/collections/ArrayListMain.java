package com.abdul.collections;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		
		
		ArrayList<Integer > arrayList= new ArrayList<Integer>();
		System.out.println("arrayList"+arrayList.size());
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		System.out.println("arrayList after adding "+arrayList);
		
		arrayList.remove(1);
		System.out.println("arrayList after remove "+arrayList);
		
		ArrayList<Integer > arrayListCopy= new ArrayList<Integer>(arrayList);
		
		System.out.println("arrayListCopy... elements"+arrayListCopy);
        Object[] object=arrayListCopy.toArray();
        
        for(Object obj:object){
        	System.out.println("obj elements"+obj);
        	
        }
	}

}
/*output
 * arrayList0
arrayList after adding [1, 2, 3, 4, 5, 6]
arrayList after remove [1, 3, 4, 5, 6]
arrayListCopy... elements[1, 3, 4, 5, 6]
obj elements1
obj elements3
obj elements4
obj elements5
obj elements6

 * arraylist is an internal implementation of dynamic array 
 * arraylist accepts duplicate elements
 * order of elements is maintained 
 * arraylist accepts fast random access of elements
 *   
 * 
 * 
 * */
