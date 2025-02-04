package com.bptn.course.teachback_code_examples;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		
		try {   //this begins the outer try block
			
			System.out.println("I start way out here.");
		
			try {  //this is the inner try block
				
				System.out.println("It's nice in here.");
				
				int undefinedNum = 7/0;  // numbers are indivisible by 0
				                         //this throws ArithmeticException
				
			} catch (ArithmeticException e) {  //inner catch block to resolve
				                               //ArithmeticException
				
				System.out.println("Inside I caught this: " + e.getMessage());
			}
			
			String blank = null;                //String assigned the value null
			System.out.println(blank.length()); // throws NullPointerException
			                                    // null string has no length
			
		} catch (Exception e) {                 //outer try block designed to handle any 
			                                    //other unresolved exceptions by referencing
		    System.out.println("Outside I caught this: " + e.getMessage());  //the Exception class.
			
		}

	}

}
