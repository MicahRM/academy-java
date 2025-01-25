package com.bptn.course._03_flow_control._02_for_loop;

public class Fibonacci {

	public static void main(String[] args) {
		// Predefined numbers to start off the Fibonacci series:
		int num1 = 0;
		int num2 = 1;
		int num3;

		System.out.println(num1);
		System.out.println(num2);

		for (int i = 2; i <= 9; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}

		// Print the first two numbers of the Fibonacci series:

		// Print the next 8 numbers of the Fibonacci series:
    

	}

}
