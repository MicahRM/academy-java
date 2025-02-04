package com.bptn.course.teachback_code_examples;

import java.io.FileNotFoundException; // FileNotFoundException imported.
import java.io.FileReader;

public class CheckedExceptionResolvedExample {
	
public static void main(String[] args) {
		
		//By choosing option 2, a try-catch block is generated 
		//around the critical statement.
		
		
		try {
			FileReader fileReader = new FileReader("lost.txt");
		} catch (FileNotFoundException e) {
			System.out.println("This file has not been found: " + e.getMessage() );
		}
	
		/*
		 * above we see the critical statement resolved by surrounding it
		 * with a try-catch block.
		 * 
		 * The program will now try to find the file, and if the file is not found
		 * the program executes the statements within the catch block and continues.
		 * 
		 */	

	}

}
