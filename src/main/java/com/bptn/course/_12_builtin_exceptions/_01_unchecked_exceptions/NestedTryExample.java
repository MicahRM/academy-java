package com.bptn.course._12_builtin_exceptions._01_unchecked_exceptions;

public class NestedTryExample {

	public static void main(String[] args) {

		// outer try-catch block

		try {

			int[] nums = { 1, 2, 3, 4 };
			int divisor = 0;
			String text = null;

			// inner try-catch block 1
			try {

				int result = nums[0] / divisor; // critical statement
				System.out.println("The result is: " + result);
			} catch (ArithmeticException e) {

				System.out.println("An arithmetic exception occurred: " + e.getMessage());
			}

			// inner try-catch block 2
			try {

				System.out.println("The length of string is: " + text.length()); // critical statement
			} catch (NullPointerException e) {

				System.out.println("A nullpointer exception occurred: " + e.getMessage());
			}

			// inner try-catch block 3
			try {

				System.out.println(nums[4]); // critical statement
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("An ArrayIndexOutOfBounds exception occurred: " + e.getMessage());
			}

		} catch (Exception e) {

			System.out.println("A general exception occurred: " + e.getMessage());

		}

		System.out.println("The statements after the outer try/catch block");

	}

}
