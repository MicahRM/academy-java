package com.bptn.course._07_polymorphism;




//Parent Class

class Shape{
	
	
	
	void drawAngle() {
		System.out.println("Drawing a shape angle");
	}
	
}




//Sub class - Child class


class Rectangle extends Shape{
	
	@Override
	void drawAngle() {
		
		System.out.println("Drawing a Rectangle");
		
	}
	
}


//Sub class - Child class


class Circle extends Shape{
	
	@Override
	void drawAngle() {
		
		System.out.println("Drawing a Circle");
		
	}
	
}








public class Polymorphism2 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.drawAngle();
		
		Circle c1 = new Circle();	
		c1.drawAngle();
		
	

	}

}




//Major key takeaways: 
//Method overriding:
/*
* 1. Scenario - when a subclass decides to override an existing method in the parent class
* 2. Name of the method, return type of the method and number of parameters and the type of the parameters in the overridden method should be the same.
* 3. By convention, the overridden method has the '@Override' annotation added above its method signature (method header)
* 4. Static methods cannot be overridden because they belong to the class and not an object.
* 5. Run-tume Polymorphism - because the change in the method happens at run-time. i.e. when running (d1.makeSound), the program will first search the dog class for an overridden method of this name to run and if not found it will then run the makeSound method in the Parent class (Animal).
*  
*  
*/

