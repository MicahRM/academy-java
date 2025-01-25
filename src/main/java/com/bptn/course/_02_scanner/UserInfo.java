package com.bptn.course._02_scanner;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		
		//step 1: create scanner object
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter your name, favourite city, age and salary");
		
		
		//step 2: get the inputs from the user and store inside variable
		
		
		//string input for name
		
		String name = myObj.nextLine();
		
		
		//string input for favourite city
		
		String favCity = myObj.nextLine();
		
		
		//int for numerical age
		
		int age = myObj.nextInt();
		
		//double for user salary
		
		double salary = myObj.nextDouble();	
		
		
		//step 3: print out the output to the console
		
		System.out.println("Name: " + name);
		System.out.println("Favourite City: " + favCity);	
		System.out.println("Age: " + age);	
		System.out.println("Salary: " + salary);
		
		
		//step 4: close the scanner
		
		myObj.close();		
		
	
	
	
	
	}

}

//asks the user to input their name, city, age and salary