package com.abdul.main;

class Calc{
	int i;
	int j;
	
	public Calc(){
		
		i=5;
		j=10;
		System.out.println("Hello initailization");
	}
	public Calc(int m){

		i=m;
		System.out.println("inside single"+i);
		
	}
	public Calc(int m,int n){

		i=m;
		System.out.println("inside 2 parameter"+i);
		
	}
	public Calc(float m){

		i=(int)m;
		System.out.println("inside  float single"+i);
		
	}
	
}

public class ConstructorMain {

	public static void main(String[] args) {

		Calc calc=new Calc();
		Calc cal1=new Calc(5);
		Calc cal2=new Calc(6,7);
		Calc cal4=new Calc(1.1f);
		
		System.out.println("values are"+calc.i+calc.j);
		
		
	}

}
/* Result
 * Hello initailization

inside single5
inside 2 parameter6
inside  float single1
values are510

Constructor is a default member function having the same name as the class name
if we dont define a constructor then compiler will provide a defalt constructor
it is used to initialize the each object with the memory it requires 
it doesnt return any value not even void if we define any return type then it becomes a method
Construction Overloading is achieved by defining different signature

*/