package com.bptn.course._03_flow_control._01_while_loop;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		//declare a variable named counter and initialize its value
		
		int counter = 1;
		
		//start the while loop
		
		while(counter < 10) {
			
			System.out.println("Counter: " + counter);
			
			//increment counter
			counter = counter + 1;
			
		}
		
		System.out.println("execute statements after the while loop");

	}

}


//counter+=2 is the same as counter = counter +2
//counter++ and counter+=1 is the same as counter = counter+1