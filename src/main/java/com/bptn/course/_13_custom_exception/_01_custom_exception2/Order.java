package com.bptn.course._13_custom_exception._01_custom_exception2;

public class Order {
	
	private int quantity;
    private double price;

    public Order(int quantity, double price) throws InvalidOrderException {
        if (quantity <= 0 || price <= 0) {
            throw new InvalidOrderException("Invalid order quantity or price.");
        }
        this.quantity = quantity;
        this.price = price;
    }

}
