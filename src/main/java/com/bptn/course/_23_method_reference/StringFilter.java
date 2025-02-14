package com.bptn.course._23_method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringFilter {

	public static void main(String[] args) {
		
		
 // Declare and initialize a list of strings
    	
    	List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));      
        
        // Declare and initialize a character to filter out
    	
    	char c = 'e';
        
        
        // Print the list before filtering
        System.out.println("List before filtering: " + list);
        
        // Use the removeIf method of the list to remove elements that contain the given character
        // The removeIf method takes a lambda expression as a parameter, which specifies the condition for removing the element
     
        //print list using lambda
        list.forEach((element)->System.out.println(element));
        
        
      //Method reference using containingType :: instanceMethodName
        
        list.forEach(System.out :: println); //reference to an instance method of an arbitrary object of a particular type
        
        
    
        // Use the removeIf method of the list to remove elements that contain the given character
        // The removeIf method takes a lambda expression as a parameter, which specifies the condition for removing the element
        
        
        list.removeIf((element) -> element.indexOf(c)!=-1); //!=-1 just checks if the indexOf char c actually exists within the element (matches desired return type)
        
            
        //not possible for method references to execute the above function because of the additional logic involved, 
        //method reference works for: calling a method with no extra logic, using forEach() to print values and using replaceAll() for modification.        
        
	}

}
