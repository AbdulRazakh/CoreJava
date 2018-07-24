package com.abdul.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorClass {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println("array list" + arrayList);

		ListIterator<Integer> listIterator = arrayList.listIterator();

		while (listIterator.hasNext()) {
			System.out.println("listIterator.next()" + listIterator.next());

		}
		while (listIterator.hasPrevious()) {
			System.out.println("has previos"+listIterator.previous());
			
		}
	}

}
