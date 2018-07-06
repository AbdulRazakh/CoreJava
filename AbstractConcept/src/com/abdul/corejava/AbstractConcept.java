package com.abdul.corejava;

public class AbstractConcept {

	public static void main(String[] args) {
		
		Suresh suresh=new Suresh();
		suresh.dance();
		suresh.display();
		suresh.move();
		suresh.show();
	}
	


}

abstract class Mahesh {
	
	void show(){
		System.out.println("Show Calling.....");
	}
	
	abstract public void display();
	abstract public void move();
	abstract public void dance();
	
	
}

abstract class Ramesh extends Mahesh{

	@Override
	public void display() {
		System.out.println("Display method");
		
	}
}

class Suresh extends Ramesh{

	@Override
	public void move() {
		System.out.println("moving.....");
		
	}

	@Override
	public void dance() {
		System.out.println("Dance.....");
		
	}
	
}	
/*points:
1 abstraction is defining the what should a class do?(General) 
rather than how it should do i.e implementation is not defined 
the class which extend it will provide the implementation 
ex: Phone in general and Iphone and Samsung  
 
2) Abstract Class Should Contain atleast one abstact method and may 
contain implemented methods.

3) A class which extends Abstract class must implement all the abstract methods
Otherwise it should be abstract again

4)We cannot initialize abstract method
Mahesh obj=new Mahesh(); 
 
Phone( Phone Iphone/Samsung) 
 */	
	
	
	

