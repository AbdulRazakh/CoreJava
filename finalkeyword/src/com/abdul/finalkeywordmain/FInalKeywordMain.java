package com.abdul.finalkeywordmain;

public class FInalKeywordMain {

	public static void main(String[] args) {

		final int i=10;
		
		//i++;
		
		
		System.out.println("value of i is"+i);
	}

}
class A{
	
	public final void show() {
		System.out.println("in class A show");
		
	}
}
class B extends A{
	/*public void show() {
		
	}*/
	
}
final class C{
	public void hello() {
		
		System.out.println("inside hello");
	}
}
/*class D extends C{
	
}*/
/*final is a keyword can be associate with a variable,method and a class
 * once we assign a value to a variable then it cannot be changed
 * method then it cannot be override
 * and class then it cannot be extended 
 * 
 * 
 * 
 * 
 * */
 