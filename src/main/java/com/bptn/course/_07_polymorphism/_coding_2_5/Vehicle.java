package com.bptn.course._07_polymorphism._coding_2_5;

public class Vehicle {
	
	//declare string color and string brand
	private String color;
	private String brand;
	

	//define parameterized constructor with color and brand a parameters
	public Vehicle(String color, String brand) {
		
		this.color = color;
		this.brand = brand;
	}
	
	//create 
	public void print() {
		System.out.println(this.color + " "  + this.brand);	
}
	
}
