package com.bptn.course._03_flow_control._02_for_loop;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {

        //initializes an integer variable for user input
        int input;

        //initializes another integer variable to store and calculate the factorial. This is chosen to be 1 to be used as a multiplier in for loop.
        int factorial = 1;


        //creates scanner object to receive the user input
        Scanner scanner = new Scanner(System.in);


        //prompts the user to enter a number.
        System.out.println("Enter a number: ");


        //reads the user entered number.
        input = scanner.nextInt();
        

        //creates for loop that initializes the value of i to 1, then increments i by 1 and executes until i is less than or equal to the user inputed number. i is somewhat of a counter for the user inputed number and is later used to calculate the factorial.
        //i can be considered as somewhat of a counter for that begins at 1 and stops at the  user inputed number and thus can later be used to calculate the factorial.
        for(int i =1; i<=input; i++){

           
        	//calculates the factorial by executing factorial * i = factorial as many times as the user inputed number previously entered.
        	//this works because we know i will keep increasing by 1 until i = input and thus the loop will be terminated and the value of the factorial stored in the variable of the same name.
        	factorial*=i;
        }
        

        //prints the closing statement to the console which specifies the number entered as well as the factorial of that number.
        System.out.println("The factorial of " + input + " is " + factorial);


        //closes scanner
        scanner.close();

    }
}

//this code is a simple Factorial calculator program that accepts a user number and produces the factorial using a for loop.