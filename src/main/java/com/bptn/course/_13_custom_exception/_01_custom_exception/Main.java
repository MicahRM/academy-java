package com.bptn.course._13_custom_exception._01_custom_exception;

public class Main {

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("12345", 1000);
		try {
			ba.withdraw(2000);
		} catch (InsufficientFundsException e) {
			System.out.println(
					"Error: Insufficient funds. You need $" + e.getAmount() + " more to complete this transaction.");
		}
		
		
		

	}

}
