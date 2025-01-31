package com.bptn.course._12_builtin_exceptions;

import java.lang.classfile.TypeAnnotation.EmptyTarget;
import java.lang.classfile.TypeAnnotation.ThrowsTarget;

public class BuiltInExceptionExample {
	
	
    //create method to check if number is positive or negative
	
	//throws-always comes in the method header (signature) which warns that an exception is going to occur
	
	public static void checkPositive(int number) throws IllegalArgumentException {
		if(number<0) {
			
			throw new IllegalArgumentException("The number must be negative");
			
		}
		
		System.out.println("The number is positive");
	}
	
	
	public static void main(String[] args) {
		
		
		try {
		checkPositive(10);  //this call is expected to be fine without any exception
		
		checkPositive(-10); 
		
		}catch (IllegalArgumentException e) {
			
			System.out.println("Caught an exception: " + e.getMessage());
			
	
		}
	}

}



/* IllegalArgumentException is subclass of RuntimeException
 * since it subclass of RuntimeException -> it is an unchecked exception
 * 
 * throws -> always comes in the method signature to declare that the method can potentially throw one or more exceptions
 * 
 * throw -> used explicitly within a method or block of code to create an instance of the Exception or its subclasses.
 * 
 * throw is used explicitly within a method or block of code
 * 
 * throws is optional in case of an unchecked exception
 * 
 * throws is always used in case of a checked exception or a custom exception which is a checked exception.
 * 
 * 
 * 
 */
