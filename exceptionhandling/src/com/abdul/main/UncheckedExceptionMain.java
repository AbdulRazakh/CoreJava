package com.abdul.main;

public class UncheckedExceptionMain {

	public static void main(String[] args) {

		int a[]=new int[4];
		try{
		for(int c=0;c<=4;c++){
			a[c]=c+1;
		}
		for(int c=0;c<=4;c++){
			System.out.println(a[c]);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("out of bound exception");
		}
	}

}
/*
 * Output  
 * out of bound exception
 * these are exceptions that occurs during the runtime is called unchecked exception
 * 
 * */
