package com.bptn.course.reverse_number;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		
		int inputNumber = 1234, reversedValue = 0;

		// inputNumber = 1200;// something else to test, remove later

		while (inputNumber > 0) { // creates a while loop to loop as long as the inputNumber is greater than 0.
			reversedValue = reversedValue * 10 + inputNumber % 10; // calculates and stores the reversed number value by
																	// 'inputNumber%10' always taking the last number
																	// from the inputNumber as the remainder and adding
																	// it to the end of the reversedValue variable after
																	// this value has been shifted 1 digit to the left
																	// by the 'reversedValue*10' function. This
																	// dynamically places the last number in the input
																	// at the beginning of the reserved value
																	// recursively until inputNumber = 0;
			inputNumber = inputNumber / 10; // this traverses the numbers of inputNumber from back to front by the
											// function 'inputNumber/10' and since this is being stored in an integer
											// variable, only the integer portion of the potential floating point number
											// will be stored thus traversing and storing every digit in inputNumber
											// until it's value is 0.
		}

		System.out.println(reversedValue);

	}

}
