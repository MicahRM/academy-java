package com.bptn.course._17_java_threads;

public class CountdownTimer implements Runnable {
	
	
	private int startValue;
	
	
	public CountdownTimer (int startValue) {
		
		this.startValue = startValue;		
	}
	
	
	
	

	@Override
	public void run() {
		
		for(int i = startValue; i>=1; i--) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		

	}

	public static void main(String[] args) {
		
		
		CountdownTimer countdownTimer = new CountdownTimer(10);  //create Countdown timer object
		
		
		Thread myThread = new Thread(countdownTimer);  //create Thread object
		
		myThread.start();  //start thread which internally calls run()
		
//		
//		try {
//			myThread.join();    //can cause the main method to wait for the thread to execute  if necessary
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		System.out.println("Main thread continues to execute...");
	
	
	
	}

}



/*
 * Main thread executes concurrently with the main thread
 * 
 * without the inclusion of the .join() method, the main thread continues to run.
 * 
 * with join() method, the main method waits for the countdown timer thread to finish execution
 * 
 * 
 */
