package com.bptn.course._23_method_reference;

import java.util.ArrayList;

public class ArrayListModification {

	public static void main(String[] args) {
		
		
		
		 // Create an ArrayList
        
    	ArrayList<String> languages = new ArrayList<>();
    	
    	
        // Add elements to the ArrayList
    	
    	languages.add("java");
    	languages.add("javascript");
    	languages.add("swift");
    	languages.add("python");
    	
    	System.out.println("Original ArrayList:");
    	
    	
        // Print the original ArrayList using forEach and a lambda
        
        //using forEach() method, lambda syntax
        languages.forEach((language) -> System.out.println(language));
        
        //Method reference using containingType :: instanceMethodName
        
        languages.forEach(System.out :: println); //reference to an instance method of an arbitrary object of a particular type
        
        
        // Modify all elements to uppercase using replaceAll() - Lambda
      	
      	languages.replaceAll((language)-> language.toUpperCase()); 
        
      	
      //Method reference using containingType :: instanceMethodName  
      	languages.replaceAll(String :: toUpperCase);   //reference to an instance method of an arbitrary object of a particular type
    	
        

	}

}


//forEach(Consumer <? super E> action) uses Consumer as an argument which is a functional interface
/*void accept(T t) -> SAM
* and can be implemented using lambda expression
* 
* replaceAll(UnaryOperator<E> operator) uses UnaryOperator as argument which is a functional interface
* 
* R apply(T t) -> SAM
* and can be implemented using lambda expression
* 
*/