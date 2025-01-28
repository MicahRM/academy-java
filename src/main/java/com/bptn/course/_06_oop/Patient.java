package com.bptn.course._06_oop;


/*
 * A class is like a construction map, blueprint or template 
 * 
 * A class has 3 types of members
 * 
 * 
 * 1. Attributes
 * 2. Methods
 * 3. Constructors
 * 
 * 
 */

public class Patient {
	
	//Attributes, Properties, Fields, Instance Variables
	
	private int id;
	private String name;
	private double height;
	private double weight;
	
	/*
	 * a constructor s a special method that is called automatically when we create
	 * an object of a class. we use constructors to initialize objects.
	 * 
	 * 
	 * Type of Constructors:
	 * 
	 * 
	 * 1. default constructor - created by default when there are no constructors in the class.
	 *  default constructor takes no parameters
	 * 
	 *              Employee(){
	 *              
	 *              }
	 *              
	 *              
	 * 2. no-argument constructor - the declaration looks like the default constructor but
	 *  in this case you create it.
	 *  
	 * note - the name of the constructor is always the name of the class and never returns a type
	 * 
	 *             
	 * constructor overloading is when we have multiple constructors with the same name but different parameters and these can be declared and initialized differently.
	 * there is also method overloading
	 */
	
	//can use the IDE to generate constructors and getters and setters based on the class name and instance variables declared.  
	//   -> right click -> source -> generate getter and setters or generate constructor using fields.
	
	Patient() {
		
	}
	
	
	
     Patient(int id, String name) {
		this.id = id;
		this.name = name;
	}



	Patient(int id, String name, double height, double weight) {
    	 
    	 this.id = id;
    	 this.name = name;
    	 this.height = height;
    	 this.weight = weight;
	}  ///this.id; and this.name can be re-written as this(id,name) along with any other variables
     

	//Methods - is a block of code that runs when it is called.
	
	//to follow the encapsulation 00P concept, we must use getters (accessor) and setters (mutators) to manipulate the attributes
	
	//the 'this' keyword is used to remove the ambiguity when we have a parameter with the same name as a class attribute. the 'this' keyword is used in front of the attribute.
	//this specifies that this is for the specified object.  this instance of a class. this object of a class
	
	
	
	int getId() {
		return id;
	}


	void setId(int id) {
		this.id = id;
	}


	String getName() {
		return name;
	}


	void setName(String name) {
		this.name = name;
	}


	double getHeight() {
		return height;
	}


	void setHeight(double height) {
		this.height = height;
	}


	double getWeight() {
		return weight;
	}


	void setWeight(double weight) {
		this.weight = weight;
	}
	

	
	
	//a method that takes no parameters and returns nothing.
	void display() { //method declaration
		//body of the method
		System.out.println("Patient ID: " + id);
		System.out.println("Patient Name: " + name);
		System.out.println("Patient Height: " + height);
		System.out.println("Patient weight: " + weight);
	}
	



	//a method that takes no parameters and returns a number (double)
	double calculateBMI() {
		double bmi = weight/(height * height);
		
		return bmi;
	}
	
	
	//a method that takes two parameters and returns a number (double)
	double payBill(double balance, double taxes) {
		
		
		double total = balance + taxes;
		
		return total;
		
	}
	
	
	static void sayHello() {
		System.out.println("World!!!");
	}
	
	

}
