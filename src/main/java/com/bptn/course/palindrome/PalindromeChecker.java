package com.bptn.course.palindrome;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
	       System.out.println("Enter the string to check for palindrome: ");
	       Scanner scanner = new Scanner(System.in);
	       String input = scanner.nextLine();
	       String reverseInput = "";


	       for(int i = input.length()-1; i >= 0; i--) {  //for loop that starts from the last character in the given string and iterates to the first. This is used to reverse the given word.
				reverseInput += input.charAt(i);	  //this creates the reversed word by assigning the the last character in the given string to the first character of the new string all the way until all characters in the original string have been added.
	       }


	       if(input.equals(reverseInput)){  //if statement that checks if the given input is equal to the reversed input thus making this word qualify as a palindrome.
	        System.out.println("Input string is palindrome");  //printing to the user that the input is a palidrome if above condition is true.
	       }else{  //else statement to handle if the input and reversed input does not match, thus making the given word not a palindrome.
	        System.out.println("Input string is not a palindrome"); //printing to the user that the input is not a palindrome.
	       }

	       // Fill in the code below to reverse the input string and store it in the reverseInput variable
	       


	       // Write the code below to display "Input string is palindrome" or "Input string is not palindrome". 
	       //Note: you'll have to write the logic to make that decision, as well.
           scanner.close();
	      
	   }

}
