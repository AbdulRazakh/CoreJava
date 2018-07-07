package com.abdul.main;

public class MethodOverloading {
	
	public void show() {
		System.out.println("show with 0 parameter");
	}
	public void show(int i) {
		System.out.println("show with integer 1  parameter");
	}
	public void show(double i) {
		System.out.println("show double 1 parameter");
	}
	public void show(int i,int j) {
		System.out.println("show 2 paramaters parameter");
	}
}

/*a method with a same name which performs different operations is called polymorphosm
 * there are 2 types of polymorphism one is method overloading and method overriding
 * in method overloading we will have methods with same name but different parameters and types
 * is called method overloading it is also called as early binding and Compiletime binding 
 *
 * 
 * */ 
 