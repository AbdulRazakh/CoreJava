package com.abdul.main;

public class CustomException {

	public static void main(String[] args) {

		
		int i=5;
		if(i<10){
			try {
				throw new MyException("Hello Error");
			} catch (MyException e) {
				
				System.out.println(e);
			}
		}
	}

}
class MyException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String message){
		super(message);
	}
}
/* Output:
 * com.abdul.main.MyException: Hello Error
 * to create a custom exception we have to create a class which extends Exception followed 
 * by the constructor and super to display the exception message 
 * thow to throw the exception
 * 
 * 
 * */
