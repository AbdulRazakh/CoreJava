package com.main.abdul;

interface Sample{
	void show();
	void display();
}
interface AnotherSample{
	void showAgain();
	void displyAgain();
	
}

interface multipleExtends extends Sample,AnotherSample{
	
	void hello();
}




public class InterfaceExample implements multipleExtends {

	public static void main(String[] args) {
		
	

	}

	@Override
	public void show() {
		System.out.println("Show.......");
		
	}

	@Override
	public void display() {
		System.out.println("display........");
	}

	@Override
	public void showAgain() {
		System.out.println("Show Again");
		
	}

	@Override
	public void displyAgain() {
		System.out.println("Display again");
		
	}

	@Override
	public void hello() {
		System.out.println("Hello ");
		
	}

}
/*interface is collection of method declarations 
 * by default all variables a public static attribute
 * by default all methods are public abstract
 * class which use interface must define all the methods
 * we can have multiple interfaces 
 * defination of methods are not allowed in interface 
 * we cannot initiate interfaces
 * 
 * 
 * 
 * */
