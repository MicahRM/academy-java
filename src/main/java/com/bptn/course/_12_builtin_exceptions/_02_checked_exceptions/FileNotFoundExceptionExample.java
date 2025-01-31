package com.bptn.course._12_builtin_exceptions._02_checked_exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {

	public static void main(String[] args) {
		
		
		try {
			readFile("hello.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("An error has occurred: " + e.getMessage());
			e.printStackTrace();
		}		
		
;
		

	}
	
	
	//create method which reads a file
	public static void readFile(String fileName) throws FileNotFoundException{
		
		FileReader fileReader = new FileReader(fileName);
		
	}

}




/* 
 * 
 * 
 * Throws is used in the method signature(header) to declare the exceptions the method might throw.
 * when i call a method or constructor (FileReader(String fileName) which has throws with a checked exception
 * in the method signature
 * 
 * 
 * java compiler gives us 2 options
 * 1st option - to surround with try/catch
 * 2nd option -  add it as  'throws' in the method signature which can be used to propagate
 * FileNotFoundException is a checked exception
 * It is a subclass of Exception which is a checked exception
 *
 *
 */






