package com.abdul.threadmain;

class Hi extends Thread
{
public void run(){
	for(int i=0;i<5;i++){
		System.out.println("hi");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}	

}

class Hello extends Thread
{
public void run(){
	for(int i=0;i<5;i++){
		System.out.println("hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}	

}





public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
    Hi hi=new Hi();
    Hello hello=new Hello();
    hi.start();
    Thread.sleep(5);
    hello.start();
	}

}
/* output 
 * hi

hello
hi
hello
hi
hello
hi
hello
hi
hello

Thread is a seperate path of execution of a process to speed up the execution 
2 types of creating thread one is extending thread class 
another is by implementing runnable interface 
in both of the above we have to override run method 
we can go for interface if we are using another class

ex class A extends B implements Runnable{
}
*/