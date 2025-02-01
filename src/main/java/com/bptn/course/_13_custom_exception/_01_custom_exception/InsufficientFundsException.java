package com.bptn.course._13_custom_exception._01_custom_exception;

public class InsufficientFundsException extends Exception {
	
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
