package com.bptn.course.print_even_from_0_to_100;

public class PrintEvenFrom0To100 {

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 100; i++) { // initializes for loop that begins at i = 1 and increments by 1 until i<=100.
			if (i % 2 == 0) { // creates a nested if-statement that checks if i%2==0 and executes if true.
				System.out.print(i + " "); // this prints the values of i that are even and also concatenates a space
											// between the printed even numbers.
			}
		}

	}

}
