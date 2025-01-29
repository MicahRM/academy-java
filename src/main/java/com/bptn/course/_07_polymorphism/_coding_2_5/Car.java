package com.bptn.course._07_polymorphism._coding_2_5;

public class Car extends Vehicle {
	
	
	//declare string steeringWheel
	private String steeringWheel;
	
	
	//define a parameterized constructor as per the specifications above and the inherited super class
	
	public Car(String color, String brand, String steeringWheel) {
		
		super(color, brand); //this calls the constructor from the Super Class (Vehicle Class)
		this.steeringWheel = steeringWheel;	
	}
	
	
//	public void print() {
//		super.print();  // this calls the print() method from the Super Class (Vehicle ClASS)
//	}
	
	
	@Override
	public void print() {  //overridden print method for car
		System.out.println("I am Car");

	}
	

}
