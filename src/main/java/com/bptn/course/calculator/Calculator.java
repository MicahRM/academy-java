package com.bptn.course.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		// initialize scanner for reading user input
		Scanner scanner = new Scanner(System.in);

		// initialize the first and second number variables and variables to store the
		// different mathematical solutions as well as the user selections

		int userSelection;
		double firstNumber;
		double secondNumber;
		double sum;
		double difference;
		double product;
		double quotient;
		double remainder;
		double square;
		double squareRoot;
		double reciprocal;
		int exitSelection;

		// create do-while loop to operate the user calculator at least once and then
		// loop as long as the while condition is satisfied.

		do {

			// This presents the calculator menu to the user

			System.out.println("/...Calculator Menu.../\n");
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for Subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 for square a number");
			System.out.println("Press 6 to find a square root");
			System.out.println("Press 7 to find reciprocal");

			userSelection = scanner.nextInt(); // Gets the selection from the user and stores it in variable

			if (userSelection >= 8 || userSelection <= 0) { // if the selection is invalid
				System.out.println("Invalid Choice! Please make a valid choice.");
			} else if (userSelection == 1) { // if selection is 1, add.
				System.out.println("Enter the First number: ");
				firstNumber = scanner.nextInt();
				System.out.println("Enter the Second number: ");
				secondNumber = scanner.nextInt();
				sum = firstNumber + secondNumber;
				System.out.println("The sum of the numbers " + firstNumber + " and " + secondNumber + " is = " + sum);
			} else if (userSelection == 2) { // if selection is 2, subtract
				System.out.println("Enter the First number: ");
				firstNumber = scanner.nextInt();
				System.out.println("Enter the Second number: ");
				secondNumber = scanner.nextInt();
				difference = firstNumber - secondNumber;
				System.out.println("The difference of the numbers " + firstNumber + " and " + secondNumber + " is = "
						+ difference);
			} else if (userSelection == 3) { // if selection is 2, multiply
				System.out.println("Enter the First number: ");
				firstNumber = scanner.nextInt();
				System.out.println("Enter the Second number: ");
				secondNumber = scanner.nextInt();
				product = firstNumber * secondNumber;
				System.out.println(
						"The product of the numbers " + firstNumber + " and " + secondNumber + " is = " + product);
			} else if (userSelection == 4) { // if selection is 4 divide
				System.out.println("Enter the First number: ");
				firstNumber = scanner.nextInt();
				System.out.println("Enter the Second number: ");
				secondNumber = scanner.nextInt();
				quotient = firstNumber / secondNumber;
				remainder = firstNumber % secondNumber;
				System.out.println("Dividing " + firstNumber + " by " + secondNumber + " is = " + quotient);
				System.out.println("The remainder is " + remainder);
			} else if (userSelection == 5) { // if selection is 5, square the number
				System.out.println("Enter the number to find Square: ");
				firstNumber = scanner.nextInt();
				square = firstNumber * firstNumber;
				System.out.println("The Square of the number " + firstNumber + " is = " + square);
			} else if (userSelection == 6) { // if selection is 6, find the square root.
				System.out.println("Enter the number to find Square Root: ");
				firstNumber = scanner.nextInt();
				squareRoot = Math.sqrt(firstNumber);
				System.out.println("The Square Root of the number " + firstNumber + " is = " + squareRoot);
			} else if (userSelection == 7) { // if selection is 7, find reciprocal
				System.out.println("Enter the number to find Reciprocal: ");
				firstNumber = scanner.nextInt();
				reciprocal = 1 / firstNumber;
				System.out.println("The Reciprocal of the number " + firstNumber + " is = " + reciprocal);
			}

			System.out.println("To continue calculation Press 1, else press any other number to exit"); // asks the user
																										// if they would
																										// like to
																										// continue use
																										// of the
																										// calculator or
																										// exit.
			exitSelection = scanner.nextInt();

		} while (exitSelection == 1); // continues loop as long as the
										// user enters 1 for
										// exitSelection

		System.out.println("Thank you for using Micah's Calculator.");
		scanner.close();
	}

}
