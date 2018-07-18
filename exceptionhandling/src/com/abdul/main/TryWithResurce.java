package com.abdul.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResurce {

	public static void main(String[] args) throws IOException  {
		
		
		try(BufferedReader br= new BufferedReader( new InputStreamReader(System.in)))
		{
			String str="";
			System.out.println("Please enter a value......");
			str=br.readLine();
			System.out.println("str value"+str);
			
		}

	}

}
