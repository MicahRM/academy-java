package com.bptn.course._12_builtin_exceptions._01_unchecked_exceptions;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		
		
		
		//critical statement
		try {
		int result = 10/0;
		
		System.out.println(result);
		} catch (ArithmeticException e) {
			
			System.out.println("An error has occurred: " + e.getMessage());
			
			
		}

	}

}


//ArithmeticException is an unchecked exception
/* ArithmeticException is a subclass of RuntimeException
 * All subclasses of RuntimeException is unchecked exception
 */
