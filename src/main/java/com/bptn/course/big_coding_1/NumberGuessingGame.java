package com.bptn.course.big_coding_1;

import java.util.Scanner;

public class NumberGuessingGame {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // creates a scanner object to read the user input

		double randomNumberDouble = Math.random() / Math.nextDown(1.0); // creates a random double value that will
																		// always be within the interval 0.0 to 1.0
		double x = 1 * (1.0 - randomNumberDouble) + 100 * randomNumberDouble; // uses the stored random double value to
																				// produce another random value between
																				// the 2 multiplied integers' range (1
																				// and 100)
		int targetNumber = (int) x; // typecasts the given random double value between 1 and 100 into an int to keep
									// the whole number portion of this number.

		// System.out.print(targetNumber); //used for testing to see the target number

		int guess; // initializes the guess variable to store the user's guess

		do { // do-while loop to facilitate the guessing game

			System.out.println("Please enter a number between 1 and 100: "); // prompts user to enter a number between 1
																				// and 100
			guess = scanner.nextInt(); // reads the next entered integer as the user's guess

			if (guess < targetNumber) { // if statement to check if the guess is less than the target number.
				System.out.println("Too low! Try again"); // prints 'Too Low!Try again to the user' if the guess <
															// targetNumber
			} else if (guess > targetNumber) { // if-else statement to check if the guess is greater than the target
												// number.
				System.out.println("Too high! Try again"); // prints 'Too High! Try again' if the guess > targetNumber
			}

		} while (guess != targetNumber); // do-while loops while guess != targetNumber, terminates when guess ==
											// targetNumber

		System.out.println("Congratulations! You guessed the number correctly!"); // prints to the user that they have
																					// guessed the number correctly.
		scanner.close(); // closes scanner

	}

}
