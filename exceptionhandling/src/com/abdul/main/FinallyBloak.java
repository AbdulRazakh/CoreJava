package com.abdul.main;

public class FinallyBloak {

	public static void main(String[] args) {
		int i=8 , j=0, k=0;
		try{
		k=i/j;
		}catch(Exception e){
			System.out.println("divide by zero error");
			
		}finally{
			
		System.out.println(k);
		}
	}

}
/*divide by zero error
0
finally block is executed weather exception occured or not 


*/