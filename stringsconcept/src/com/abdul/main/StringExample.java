package com.abdul.main;

public class StringExample {

	public static void main(String[] args) {
		
		
		String s1="Abdul";
		String s2="Abdul";
		String s3=new String("Hello");
		String s4=new String("Hello");
		String s5=new String("Abdul");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		StringBuffer str=new StringBuffer("abc");
		str.reverse();
		System.out.println(str.toString());
	}

}
/*Strings are immutable means that once you create a String with a value you cannot change it 
 * means any number of object with same value only it points to a reference is created in stack of reference
 * if we create using a literal then it uses String POOL memory 
 * if we create using new object then it uses heap memory a reference to String pool
 * 
 * output
 * 63048218
63048218
69609650
69609650
63048218

To create mutable String we can use StringBuilder and StringBuffer but the only difference is 


StringBuffer is thread safe as it allows only one thread to modify at a time

  */
 