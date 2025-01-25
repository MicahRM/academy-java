package com.bptn.course.string_operations;

import java.util.Scanner;

public class StringOperators {

	public static void main(String[] args) {

		// initialize scanner for reading user input
		Scanner scanner = new Scanner(System.in);

		// initialize the first and second String reference variables and variables to
		// store the reverse string and selection choices of the user.

		int userSelection;
		String firstString;
		String firstString1;
		String secondString;
		String reverseString = " ";
		String reverseString1 = " ";
		int exitSelection;

		// create do-while loop to operate the String Operator at least once and then
		// loop as long as the while condition is satisfied.

		do {

			// This presents the String Operator menu to the user

			System.out.println("/...String Menu.../\n");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to reverse a String");
			System.out.println("Press 3 for to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 to calculate the length of String");

			userSelection = scanner.nextInt(); // Gets the selection from the user and stores it in variable

			scanner.nextLine(); // moves the scanner down one line so that it can read the subsequent strings to
								// be entered in the program rather than the empty line that is left after the
								// first integer is read.

			if (userSelection >= 6 || userSelection <= 0) { // if the selection is invalid
				System.out.println("Invalid Choice! Please make a valid choice.");

			} else if (userSelection == 1) { // if selection is 1, Palindrome Check.
				System.out.println("Palindrome Check");
				System.out.println("Enter a String: ");
				firstString = scanner.nextLine();

				for (int i = firstString.length() - 1; i >= 0; i--) { // for loop that starts from the last character in
																		// the given string and iterates to the first.
																		// This is used to reverse the given word.
					reverseString += firstString.charAt(i); // this creates the reversed word by assigning the the last
															// character in the given string to the first character of
															// the new string all the way until all characters in the
															// original string have been added.
				}

				if (firstString.equals(reverseString)) { // if statement that checks if the given input is equal to the
															// reversed input thus making this word qualify as a
															// palindrome.
					System.out.println(firstString + " is a palindrome"); // printing to the user that the input is a
																			// palindrome if above condition is true.
				} else { // else statement to handle if the input and reversed input does not match, thus
							// making the given word not a palindrome.
					System.out.println(firstString + " is not a palindrome"); // printing to the user that the input is
																				// not a palindrome.
				}

			} else if (userSelection == 2) { // if selection is 2, reverse a String
				System.out.println("String Reversal");
				System.out.println("Enter a String: ");
				firstString1 = scanner.nextLine();

				for (int i = firstString1.length() - 1; i >= 0; i--) { // for loop that starts from the last character in
																		// the given string and iterates to the first.
																		// This is used to reverse the given word.
					 reverseString1 += firstString1.charAt(i); // this creates the reversed word by assigning the the last
															// character in the given string to the first character of
															// the new string all the way until all characters in the
															// original string have been added.
				}
				System.out.println(reverseString1);

			} else if (userSelection == 3) { // if selection is 3, concatenate two strings
				System.out.println("Enter the First String: ");
				firstString = scanner.nextLine();
				System.out.println("Enter the Second String: ");
				secondString = scanner.nextLine();
				System.out.println(firstString + secondString);

			} else if (userSelection == 4) { // if selection is 4, compare two strings
				System.out.println("Enter the First String: ");
				firstString = scanner.nextLine();
				System.out.println("Enter the Second String: ");
				secondString = scanner.nextLine();

				if (firstString.equals(secondString)) {
					System.out.println("The entered strings are equal.");
				} else {
					System.out.println("The entered strings are not equal.");
				}

			} else if (userSelection == 5) { // if selection is 5, calculate the length of the string
				System.out.println("Length of a string");
				System.out.println("Enter a string: ");
				firstString = scanner.nextLine();
				System.out.println("The length of the entered string is: " + firstString.length());
			}

			System.out.println("To continue using String Operations Press 1, else press any other number to exit"); // asks the user
			                                                                                                        // if they would like to continue use of the String Operator or exit.
																																					
			exitSelection = scanner.nextInt();

		} while (exitSelection == 1); // continues loop as long as the
										// user enters 1 for
										// exitSelection

		System.out.println("Thank you for using Micah's String Operator!");
		scanner.close();

	}

}
