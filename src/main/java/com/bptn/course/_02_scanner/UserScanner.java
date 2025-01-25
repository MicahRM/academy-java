package com.bptn.course._02_scanner;

import java.util.Scanner;

//step 2: import the scanner package

public class UserScanner {

	public static void main(String[] args) {
		
		//step 1: Declare the Scanner Object
		//ClassName objectName = new ClassName();
		
		
		Scanner myObj = new Scanner(System.in);
		
		
		//step 3: create a variable called 'userName' to store the user input
		
		String userName;
		
		//step 4: ask the user to enter the username by printing 'Enter the Username' to the console
		
		System.out.println("Enter the Username: ");
		
		//step 5: get the user name from the user using the nextLine() method and store it inside the variable
		
		userName = myObj.nextLine();
		
		
		//step 6: finally print the variable to the console
		
		System.out.println("Username is: " + userName);
		
		//step 7: close the scanner object
		
		myObj.close();
		
		

	}

}
// get user name from user and print output to the console.