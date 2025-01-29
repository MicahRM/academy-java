package com.bptn.course._07_polymorphism._coding_2_5;

public class Bike extends Vehicle {
	
	
	//declare string bikeHnadle
	private String bikeHandle;
	
	
	
	//define a parameterized constructor as per the specifications above and the inherited super class
	Bike(String color, String brand, String bikeHandle) {
		
		super(color, brand);  //this calls the constructor from the Super Class (Vehicle Class)
		this.bikeHandle =  bikeHandle;
	}
	
//	
//	public void print() {
//		super.print();  // this calls the print() method from the Super Class (Vehicle ClASS)
//	}
//	
	
	public void print() { //overridden print method for bike
		System.out.println("I am Bike");

	}
	
	

}
