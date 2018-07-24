package com.abdul.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClassMain {

	public static void main(String[] args) {
		System.out.println("iterator class");
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		Iterator<Integer> itr=arrayList.iterator();
		
		while (itr.hasNext()) {
			 
			System.out.println("element..........."+itr.next());
			
		}
		Iterator<Integer> itr2=arrayList.iterator();
		
		while (itr2.hasNext()) {
			int element=itr2.next(); 
			System.out.println("inside remove before ");
			if(element == 40){
				System.out.println("inside remove");
				itr2.remove();
			}
			
		}
		System.out.println("array list"+arrayList);
       
       
	}

}
/*output
 
  * iterator class
element...........10
element...........20
element...........30
element...........40
element...........50
inside remove before 
inside remove before 
inside remove before 
inside remove before 
inside remove
inside remove before 
array list[10, 20, 30, 50]



iterator is used to traverse over any collection class 
it allows only in forward direction
it contains 3 methods
hasNext():returns true if it contains more elements
next():provide next element in collection
remove():removes the element of collection class
  * 
  * 
  * 
  * */


