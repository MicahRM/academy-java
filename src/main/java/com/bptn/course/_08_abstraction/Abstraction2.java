package com.bptn.course._08_abstraction;



//abstraction using interface (Before Java 8)



interface ShapeInterface{
	
	//Before Java 8- interfaces had only abstract methods and constants
	
	
	//lets create some abstract methods - no implementation
	
	
	void draw();
	
	double getArea();
}



//implement the abstract methods from the interface by creating a sub class



class RectangleClass implements ShapeInterface{
	
	private double width;
	private double height;

	@Override
	public void draw() {
		System.out.println("Draw a Rectangle");
	
	}

	@Override
	public double getArea() {
		
		return this.height * this.width;
	}
	
	
}




//Abstraction using interface (Before Java 8)

public class Abstraction2 {

	public static void main(String[] args) {
		
		
		//create an object of RectangleClass
		
		RectangleClass r1 = new RectangleClass();
		
		r1.draw(); //calls the method from RectangleClass

	}

}


//Major key takeaways
/*Abstraction using interface (Before Java 8)
 * Interfaces cannot be instantiated
 * 
 * before Java 8 - interfaces only had constraints and abstract methods
 * 
 * 
 * 
 * 
 * */
