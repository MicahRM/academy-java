package com.bptn.course._12_builtin_exceptions._01_unchecked_exceptions;

public class Main1 {

	void method() {

		// outer try-catch block
		try {

			// inner try-catch block
			try {

				int[] arr = { 1, 2, 3, 4 };

				System.out.println(arr[0]); // this will not fail
				System.out.println(arr[5]); // this will fail and is a critical statement
             
			} catch (ArithmeticException e) {

				System.out.println("Arithmetic Exception occurred: ");

			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");

		}

	}

	public static void main(String[] args) {

		Main1 nestedTryBlockSolutionObject = new Main1();
		nestedTryBlockSolutionObject.method();
	}

}
