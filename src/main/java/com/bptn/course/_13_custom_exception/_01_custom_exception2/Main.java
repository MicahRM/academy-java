package com.bptn.course._13_custom_exception._01_custom_exception2;

public class Main {

	public static void main(String[] args) {
		
		try {
            Order order = new Order(-5, 20);
        } catch (InvalidOrderException e) {
            System.out.println(e.getMessage());
        }
		

	}

}
