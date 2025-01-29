package com.bptn.course._07_polymorphism;



//Parent class
class Animal{
	
	void makeSound() {
		System.out.println("Animal makes a sound");
		
	}
}








//Sub-Class

class Dog extends Animal{
	
	
	@Override
	void makeSound() {
		System.out.println("Dog makes a sound");
	}
	
	//it can have other methods as well
	
	
}

public class Polymorphism1 {

	public static void main(String[] args) {
		
		//create an object of Animal Class
		Animal a1 = new Animal();
		a1.makeSound();
		
		//create an object of Dog Class
		Dog d1 = new Dog();
		d1.makeSound();
		

	}

}



//Major key takeaways: 
//Method overriding:
/*
 * 1. Scenario - when a subclass decides to override an existing method in the parent class
 * 2. Name of the method, return type of the method and number of parameters and the type of the parameters in the overridden method should be the same.
 * 3. By convention, the overridden method has the '@Override' annotation added above its method signature (method header)
 * 4. Static methods cannot be overridden.
 * 5. Run-tume Polymorphism - because the change in the method happens at run-time. i.e. when running (d1.makeSound), the program will first search the dog class for an overridden method of this name to run and if not found it will then run the makeSound method in the Parent class (Animal).
 *  
 *  
 */
