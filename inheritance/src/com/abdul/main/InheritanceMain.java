package com.abdul.main;

public class InheritanceMain {

	public static void main(String[] args) {
		
		
		ClassC classC=new ClassC();
		int  result=classC.addition(1, 2);
		int  result1=classC.subtract(2, 1);
		int  result2=classC.multiply(2, 3);
		
		System.out.println("Addition result"+result );
		System.out.println("subtraction result"+result1 );
		System.out.println("Multiplication result"+result2);

	}

}
/*
 * 
 *Result: 
 * Addition result3
 
subtraction result1
Multiplication result6
Inheritnce is just a reusing the already existing code using extend key word to 
as above code
*
*/