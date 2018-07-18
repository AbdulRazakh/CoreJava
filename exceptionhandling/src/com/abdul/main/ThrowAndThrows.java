package com.abdul.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowAndThrows {

	public static void main(String[] args) throws Exception {
		
		
		int i = 16,j = 4,k;
		try{
		k=i/j;
		if(k<10){
			throw new ArithmeticException();
		}
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		br.readLine();
		}catch(IOException e){
		System.out.println("Inside IOException");	
		}catch(ArithmeticException e){
			System.out.println("divide by zero error");
		}
		
	}

}
/*output
 * divide by zero error
throw to thorw an exception explicitky and throws to explicitly surpress the exception

 * 
 * 
 * 
 * */
