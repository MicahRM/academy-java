package com.bptn.course._10_access_modifiers._02_package_b;

import com.bptn.course._10_access_modifiers._01_package_a.ClassA;

public class ClassB extends ClassA {  //subclass creation (inheritance)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA myObj = new ClassA();
		
		
		
		
		//no, we cannot access default methods from another class in a different package
	    //myObj.defaultMethod();
		
		
		//no, we cannot access default variables from another class in a different package
	    //System.out.println("Default Variable: " + myObj.defaultVar);
		
		  
		//yes we can access public methods within the same class
		 myObj.publicMethod();
		  		
		//yes we can access public variables within the same class
		System.out.println("Public Variable: " + myObj.publicVar);
		  	
		ClassB myObj1 = new ClassB(); //creation of the classB object that extends classA		  	
		  	
		//no we can not access protected methods within a class of another package
	    //myObj.protectedMethod();
		
		
		//we can access protected methods and variables once the child instance is created for the sublclass and we must use this to access the protected methods and variables	
		myObj1.protectedMethod();
			
	  
		System.out.println("Protected Variable: " + myObj1.protectedVar);

		  		
	}

}



/*Major Key Takeaways
 * 
 * 1. We cannot access private variables or methods from a different class which exists in the same package.
 * 
 * 2. we can access default variables or methods from different classes that exist in the same package.
 * 
 * 3. Default is package private so we can only access the default method and variables with classes that are in the same package.
 * 4. we can access public variables 
 * 
 * 5. we cannot access protected variables or methods from a different class in a different package.
 * 
 * 6. we can access protected variables and methods from a different class which exists in a different paclage through subclass(inheritance)
 * 
 * 7. when we create an object of ClassA(_01_package_a) in ClassB(_02_package_b) we add an import of the required package.
 * 
 * Visiblity ranking below: (Highest to lowest)
 * public
 * protected
 * default
 * private
 * 
 */

 

