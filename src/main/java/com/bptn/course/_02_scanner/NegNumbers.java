package com.bptn.course._02_scanner;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		
		//create a scanner object from the scanner class
		
		Scanner myObj = new Scanner(System.in);
		
		int number;
		
		//request user input and store inside the variable
		
		System.out.println("Enter an Integer: ");
		
		number = myObj.nextInt();
		
		boolean isNegative;
		
		//checking the conditions
		
		
		if(number > 0) {
			isNegative = false;
			System.out.println("The number  is positive.");
			
		}else if(number < 0) {
			isNegative = true;
			System.out.println("The number is negative.");
		}else {
			isNegative = false;
			System.out.println("The number is equal to zero.");		
		}
		
		
		//close the scanner object
		myObj.close();	
	
	}

}



/* create a scanner object
 * import the scanner package 
 * print "enter a number"
 * read user input
 * check if number is > 0
 * if yes, print the number is positive
 * else if number < 0, print the number is negative
 * otherwise print, the number is equal to zero
 * close scanner
 */
			
		