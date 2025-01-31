package com.bptn.course._12_builtin_exceptions._01_unchecked_exceptions;

public class ArrayIndexExceptionExample {

	public static void main(String[] args) {
	
        
		int[] arr = {10,20,30};
		
		//critical statement - accessing an index that is not found
		
		try {
			System.out.println(arr[10]);
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("An error has occured: " + e.getMessage());
			
		}
	}

}

/* ArrayIndexOutOfBoundsException is an unchecked Exception
 * ArrayIndexOutOfBoundsException is a subclass of IndexOutofBoundsException
 * IndexOutOfBoundExeption is a subclass of RuntimeException
 * All subclasses of RuntimeException is unchecked exception
 * 
 * 
 * 
 * 
 */
