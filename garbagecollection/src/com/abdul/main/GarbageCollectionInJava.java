package com.abdul.main;


class Dog{
	private int dogId;
	private String name;
	
	public Dog(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
}

public class GarbageCollectionInJava {

	public static void main(String[] args) {
		
		Dog d1=new Dog("t1");
		Dog d2=new Dog("t2");
		Dog d3=new Dog("t3");
		Dog d4=new Dog("t4");
		
		d2=new Dog("d280980");
		//System.gc();
		System.out.println("m.........."+d2.toString());
	}
	
	
/*output
 * m..........d280980
garbage collection is a automatic process of deallocating memory that is allocated 
to objects once it is no longer used 
 * 
 * 
 * 
 * */

}
