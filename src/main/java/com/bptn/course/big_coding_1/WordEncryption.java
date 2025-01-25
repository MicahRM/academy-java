package com.bptn.course.big_coding_1;

import java.util.Scanner;

public class WordEncryption {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // creates a new scanner object

		System.out.println("Enter a Word: "); // prompts the user to enter a word

		String word = scanner.nextLine(); // reads the word entered by the user

		System.out.print("Encrypted word: "); // prints out 'Encrypted Word: ' to the console

		for (int i = 0; i < word.length(); i++) { // for loop that iterates the length of the word.
			if (word.charAt(i) == 'z') { // if-else statement to handle 'z'
				System.out.print('a'); // prints the encrypted'a' if 'z' is encountered in string traversal.
			} else if (word.charAt(i) == 'Z') { // if-else statement to handle 'Z'.
				System.out.print('A'); // prints the encrypted 'A' if 'Z' is encountered in string traversal
			} else if (word.charAt(i) >= 'a' && word.charAt(i) < 'z' || word.charAt(i) >= 'A' && word.charAt(i) < 'Z') { // if-else
																															// statement
																															// to
																															// determine
																															// alphabetical
																															// characters
																															// in
																															// the
																															// word
																															// based
																															// on
																															// the
																															// ASCII
																															// chart
																															// (excluding
																															// 'z'
																															// and
																															// 'Z')
				System.out.print((char) (word.charAt(i) + 1)); // prints the the encrypted char after the ASCII value
																// has been increased by 1
			} else { // else prints all numbers and any other characters as initially entered
				System.out.print(word.charAt(i)); // printing of these unchanged characters (numbers)
			}
		}

		scanner.close();

	}

}
