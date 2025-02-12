package com.bptn.course._17_java_threads._coding_311;

public class MyThread extends Thread {
	
	
	SynchronizedPrinter printer;

    // Create a constructor to initialize the printer instance variable.
	
	public MyThread(SynchronizedPrinter printer) {
		
		this.printer = printer;
		
	}


    // Override the run() method to call printNumbers() method of the printer instance variable.
	
	
	@Override
	public void run() {

		this.printer.printNumbers();
		
		
		
	}


}