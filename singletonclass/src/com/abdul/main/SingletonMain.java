package com.abdul.main;

/**
 * @author Abdul
 *
 */
public class SingletonMain {

	public static void main(String[] args) {
		Abc abc=Abc.getInstance();
		Abc abc1=Abc.getInstance();

	}

}
class Abc{
	
	//1)
	static Abc obj=new Abc();
	//2)
	private Abc(){
		
	}
	//3)
	public static Abc getInstance(){
		return obj;
	} 
	
	
}
/*The Singleton's purpose is to control object creation, limiting the
number of objects to only one.Since there is only one Singleton instance, 
any instance fields of a Singleton will occur only once per class, 
just like static fields. Singletons often control access to resources, 
such as database connections or sockets.

For example, if you have a license for only one connection for your
database or your JDBC driver has trouble with multithreading, 
the Singleton makes sure that only one connection is made or that only 
one thread can access the connection at a time.*/