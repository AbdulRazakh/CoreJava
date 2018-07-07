package com.abdul.main;

public class PloymorphismMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading methodOverloading=new MethodOverloading();
		
		methodOverloading.show();
		methodOverloading.show(2);
		methodOverloading.show(2, 3);
		methodOverloading.show(2.2);
		
		MethodOveriding methodOveriding=new MethodOveriding();
		methodOveriding.show();
		
		Child child=new Child();
		child.show();
	}

}
/*
 *
 * 
 * Output
 * show with 0 parameter
 show with integer 1  parameter
show 2 paramaters parameter
show double 1 parameter
show in parent
Overrided show in child class
*/