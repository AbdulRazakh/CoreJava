package com.abdul.main;

public class CheckedException {

	public static void main(String[] args) {
		
		
		int i=8 , j=0, k=0;
		try{
		k=i/j;
		}catch(Exception e){
			System.out.println("divide by zero error");
			
		}
		System.out.println(k);

	}

}
/*Output
 *
divide by zero error
0
 * */
 