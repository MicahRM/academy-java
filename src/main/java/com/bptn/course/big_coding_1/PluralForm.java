package com.bptn.course.big_coding_1;

import java.util.Scanner;

public class PluralForm {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("# in:");
		int amt = inp.nextInt();
		inp.nextLine(); // this line is necessary
		System.out.print("word:");
		String word = inp.nextLine();

		if (amt == 1) { // if statement to check if amount entered is 1
			System.out.print(amt + " " + word); // if amt = 1 this prints the amount and the word (1 + word)
		}

		if (amt != 1) { // if statement to handle if amt != 1
			if (word.endsWith("fe")) { // checks if word ends with 'fe'
				System.out.println(amt + " " + word.substring(0, word.length() - 2) + "ves"); // if word ends with 'fe'
																								// this appends 'ves' in
																								// the correct location
																								// and prints the amount
																								// and plural word.
			} else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) { // checks
																													// if
																													// the
																													// word
																													// ends
																													// in
																													// a
																													// vowel
																													// +
																													// 'y'
				System.out.println(amt + " " + word + "s"); // if word ends with vowel + 'y' this appends 's' to the end
															// of the word and prints the word
			} else if (word.endsWith("y")) { // checks if the word ends with 'y'
				System.out.println(amt + " " + word.substring(0, word.length() - 1) + "ies"); // if word ends with 'y'
																								// this appends 'ies' in
																								// the correct location
																								// and prints the amount
																								// and plural word.
			} else if (word.endsWith("sh") || word.endsWith("ch")) { // checks if the word ends with 'ch' or 'sh'
				System.out.println(amt + " " + word + "es"); // if the word ends with 'ch' or 'sh' this appends 'es' to
																// the end of the word and prints the amount and plural
																// word.
			} else if (word.endsWith("us")) { // checks if the word ends with 'us'
				System.out.println(amt + " " + word.substring(0, word.length() - 2) + "i"); // if the word ends with
																							// 'us' this appends 'i' in
																							// the correct location and
																							// prints the amount and
																							// plural word
			} else { // else statement to handle all other occurrences of a plural word by simply
						// adding an 's' to the end of the word.
				System.out.println(amt + " " + word + "s"); // prints the amount and the plural word for the remaining
															// plural words (adds an 's' to the end of the word)
			}
		}

		inp.close();

	}

}
