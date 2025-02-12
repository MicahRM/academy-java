package com.bptn.course.big_coding_3.custom_exception_using_hashmap;

public class OutOfStockException extends Exception {
	
	 // Modify the constructor below to take a String message parameter.   
    public OutOfStockException(String message) {
    	super(message);
    	
    	// Call the superclass constructor passing the message parameter.
    }

}
