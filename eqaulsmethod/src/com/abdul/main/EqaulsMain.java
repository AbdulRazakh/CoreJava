package com.abdul.main;

public class EqaulsMain {

	public static void main(String[] args) {
		String str1=new String("abc");
		String str2=new String("abc");
		
		
		if(str1==str2){
			System.out.println("both are equal str1==str2");
		}else{
			System.out.println("both are not equal str1!=str2");
			System.out.println("hashCode of str1 "+System.identityHashCode(str1));
			System.out.println("hashCode of str2 "+System.identityHashCode(str2));
		}
		if(str1.equals(str2)){
			System.out.println("both are equal str1.equals(str2)");
			System.out.println("hashCode of str1 "+System.identityHashCode(str1));
			System.out.println("hashCode of str2 "+System.identityHashCode(str2));
		}else{
			System.out.println("both are not equal str1.equals(str2)");
			System.out.println("hashCode of str1 "+System.identityHashCode(str1));
			System.out.println("hashCode of str2 "+System.identityHashCode(str2));
		}
		

	}

}
/* Output
both are not equal str1!=str2
hashCode of str1 366712642
hashCode of str2 1829164700
both are equal str1.equals(str2)
hashCode of str1 366712642
hashCode of str2 1829164700


== method compares the reference of two object
.equals compares the value of object
*
*/