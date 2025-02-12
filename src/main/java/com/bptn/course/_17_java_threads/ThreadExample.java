package com.bptn.course._17_java_threads;


public class ThreadExample extends Thread {
	
	
	
	// create the ThreadExample constructor to create a thread
	
	
   public ThreadExample(String name) {
		super();
		
	}
			
			
	@Override
   public void run() {   //overrides the run method within the Thread class to give these thread objects some actions
		
		
	  for(int i = 0; i<5; i++) {
			
			System.out.println(Thread.currentThread().getName()+ " - Count" +i);
			
			try {
				Thread.sleep(1000);   //pause for a second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
			
	public static void main(String[] args) {
		
		
		//create objects of ThreadExample class
		
	
		ThreadExample t1 = new ThreadExample("Thread 1");
		
		
		ThreadExample t2 = new ThreadExample("Thread 2");
		
		
		
		//start the threads which invokes the run method
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();  //main thread can now wait for t1 and t2 to finish before execution
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		System.out.println(Thread.currentThread().getName()  + " - Main thread is executing here!");  //main thread, so this executes before t1 and t2 without join, must use join to link t1 and t2 to main thread  for main thread to run after
		
		
		
		

	}

}
