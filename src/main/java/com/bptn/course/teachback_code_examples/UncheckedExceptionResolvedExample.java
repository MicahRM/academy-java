package com.bptn.course.teachback_code_examples;

public class UncheckedExceptionResolvedExample {

	public static void main(String[] args) {
	
		String word = "no numbers here";  //string literal is declared
		
	try {
		
		int num = Integer.parseInt(word); 
		System.out.println("The number in this string is: " + num);
	
	} catch (NumberFormatException e) {
		
		System.out.println("This string has no number " + e.getMessage());
		
	}	
	
	//Surrounding the critical statement with a try-catch block gives
	//instructions on how to continue execution in the case that this 
	//exception is thrown by this critical statement. This program will run.
		

	}

}
