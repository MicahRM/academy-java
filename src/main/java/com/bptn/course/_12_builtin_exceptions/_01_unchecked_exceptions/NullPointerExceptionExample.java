package com.bptn.course._12_builtin_exceptions._01_unchecked_exceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		
		
		String text = null;
		
		
		try {
			System.out.println("Lenght of the string is: " + text.length());
		} catch (NullPointerException e) {
			System.out.println("an error has occured: " + e.getMessage());
		
		}
	

	}

}

/*NullPointerException is a subclass of RuntimeException
 * All subclasses of RuntimeException is an unchecked exception
 */
