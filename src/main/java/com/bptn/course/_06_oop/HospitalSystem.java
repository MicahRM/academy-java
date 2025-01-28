package com.bptn.course._06_oop;

public class HospitalSystem {

	public static void main(String[] args) {  //static method means the method belongs to the class and not the object
		
		/*
		 * 1. direct - not recommended
		 */
		
		//declared the pat1 variables and initialized it.
		
		Patient pat1 = new Patient();
		
		
		// breaking the encapsulation OOP Concept
		//pat1.id = 1000;
		
		//pat1.name = "John";
		
		//pat1.height = 1.75; //in meters
		
		//pat1.weight = 73;  //in kilograms
		
		//pat1.display();
		
		double bmi = pat1.calculateBMI();
		
		System.out.println("BMI is: " + bmi);
		
		
		double total = pat1.payBill(1000, 200);
		
		System.out.println("//////////////////////");
		
		/*
		 * 2. Getters and setters
		 */
		
		// declared the pat2 variable and initialized it.
		Patient pat2 =  new Patient();
		
		pat2.setId(2000);
		pat2.setName("Jane");
		pat2.setWeight(60);
		pat2.setHeight(1.70);
		
		pat2.display();
		
		double bmi2 = pat2.calculateBMI();
		System.out.println("BMI is: " + bmi2);
		
		double total2 = pat2.payBill(1200, 250);
		System.out.println("Total is: " + total2);
		
		System.out.println("//////////////////////");
		
		
		
		/*
		 * 3. parameterized constructor
		 */
		
		
		
		Patient pat3 = new Patient(3000, "Lily", 1.6, 50);
		
		pat3.display();
		
		double bmi3 = pat3.calculateBMI();
		System.out.println("BMI is: " + bmi3);
		
		double total3 = pat3.payBill(1200, 250);
		System.out.println("Total is: " + total3);

		
		System.out.println("//////////////////////");
		
		Patient pat4 = new Patient(4000, "Nick");
		pat4.setHeight(1.85);
		pat4.setWeight(80);
		
		pat4.display();
		
		double bmi4 = pat4.calculateBMI();
		System.out.println("BMI is: " + bmi4);
		
		double total4 = pat4.payBill(1200, 250);
		System.out.println("Total is: " + total4);
		
		
		
		sayHello();
		
		Patient.sayHello();		
	}
	
	static void sayHello() {
		System.out.println("World!!!");
	}

}
