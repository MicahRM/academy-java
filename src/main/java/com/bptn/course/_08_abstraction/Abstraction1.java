package com.bptn.course._08_abstraction;

//Abstraction using abstract class

//Abstract class cannot be instantiated or it cannot be used to create objects

abstract class Shape {

	// Abstract method - has no implementation (logic or commands)
	abstract void draw();

	abstract void print();

	// concrete methods - has implementation

	void moveTo(int x, int y) {
		System.out.println("Move to: " + x + " " + y);
	}

}

// sub class Circle (child class) extends Shape class

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a circle");
	}

	@Override
	void print() {
		System.out.println("Print a Circle");
	}

}

// sub class Rectangle (child class) extends Shape class

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a rectangle");

	}

	@Override
	void print() {
		System.out.println("Print a rectangle");

	}

}

public class Abstraction1 {
	public static void main(String[] args) {

		Circle c1 = new Circle();

		c1.draw();
		c1.print();
		c1.moveTo(2, 3);

		Rectangle r1 = new Rectangle();

		r1.draw();
		r1.print();
		r1.moveTo(5, 6);

	}

}

//Major Key Takeaways
/*
 * Abstract classes cannot be instantiated or it cannot be used to create
 * objects. Abstract class can consist of abstract methods and non abstract
 * methods(concrete methods) Abstract method has no implementation within it -it
 * is implementesd using the subclass
 **/
