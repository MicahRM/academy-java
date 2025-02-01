package com.bptn.course._13_custom_exception._01_custom_exception;

public class BankAccount {
	
	
	private double balance;
	private String accountNumber;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
		balance -= amount;
		System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
	}

}
