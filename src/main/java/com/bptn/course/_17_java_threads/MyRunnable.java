package com.bptn.course._17_java_threads;

public class MyRunnable implements Runnable {

	
	
	@Override
	public void run() {
		
		
		for(int i =0; i<100; i++) {
			
			
			System.out.println(i);
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}		
			
		
		}
		
		
		

	}

	public static void main(String[] args) {
		
		
		//create an object of MyRunnable class (that implements the Runnable interface)
		
		
		MyRunnable myObj = new MyRunnable();
		
		Thread thread = new Thread(myObj);
		
		thread.start();
		
	
	
	
	}

}


/*
 * 1. create a class that implements Runnable interface, it only needs to implement the run() method
 * 2. create an object of this class(which implements the runnable interface)
 * 3. and that object will be passed as an argument to the Thread constructor
 * 
 * 
 * 
 * 
 * 
 */
