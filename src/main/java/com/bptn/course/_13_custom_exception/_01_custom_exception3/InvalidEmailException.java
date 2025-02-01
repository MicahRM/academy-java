package com.bptn.course._13_custom_exception._01_custom_exception3;

public class InvalidEmailException extends Exception {
	
	public InvalidEmailException(String message) {
		super(message);
		
	}
}
