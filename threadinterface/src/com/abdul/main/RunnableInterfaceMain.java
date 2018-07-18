package com.abdul.main;

class Hi implements Runnable{
	
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
class Hello implements Runnable{
	
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

public class RunnableInterfaceMain {

	public static void main(String[] args) throws InterruptedException {

		Hi hi=new Hi();
		Hello hello=new Hello();
		
		Thread t1=new Thread(hi);
		Thread t2=new Thread(hello);
		t1.start();
		Thread.sleep(5);
		t2.start();
	}

}
/*output
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
we have to provide runnable interface object here 
 * 
 * 
 * 
 * */
