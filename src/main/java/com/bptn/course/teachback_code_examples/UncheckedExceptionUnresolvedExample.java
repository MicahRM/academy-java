package com.bptn.course.teachback_code_examples;

public class UncheckedExceptionUnresolvedExample {

	public static void main(String[] args) {
		
		String word = "no numbers here";  //string literal is declared
		
		int num = Integer.parseInt(word);  //string is attempted to be parsed into an
		                                   // integer named 'num' using the .parseInt() 
		                                   // function of the Integer Wrapper Class.
		                                   // No int can be parsed from this string so
		                                   // the program crashes.

	}

}
