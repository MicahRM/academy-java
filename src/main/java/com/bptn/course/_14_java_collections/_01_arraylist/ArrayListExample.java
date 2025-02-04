package com.bptn.course._14_java_collections._01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//first way of declaring an ArrayList
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		//second way of declaring ArraList
		List<Integer> arrayList1 = new ArrayList<>();
		
		
		//add values into the arrayList1
		
		arrayList1.add(100);		
		arrayList1.add(200);	
		arrayList1.add(300);	
		arrayList1.add(400);
		arrayList1.add(null);	//it allows null value
		arrayList1.add(400);	//it allows duplicates
		arrayList1.add(null);  //it even allows duplicate null	
	
		//print out arrayList1
		
		System.out.println(arrayList1);
		
		
		//print the size of arrayList1
		
		System.out.println("The sixe of arrayList1 is: " + arrayList1.size());	
		
		
		//access the first element of the list
		
		System.out.println("The first element is: " + arrayList1.get(0));
		
		
		//update an element at index 2
		
		arrayList1.set(2, 250);
		
		System.out.println("Updated element: " + arrayList1.get(2));
		
		
		
		//update an element at index 5
		
		arrayList1.set(5, 450);
				
		System.out.println("Updated element: " + arrayList1.get(5));
		
		
		//update an element at index 10
		
		 //arrayList1.set(10, 550);  doesnt work becausee 10 is out of bounds for 7
						
				//System.out.println("Updated element: " + arrayList1.get(10));
		
		//add an element at index 7
		
		arrayList1.set(7, 500);
						
	    System.out.println("Updated added element: " + arrayList1);
	    
	    
	    //remove an element at index 4
	    System.out.println("The removed element is: " + arrayList1.remove(4));				
		
	    System.out.println("Updated ArrayList " + arrayList1);
	    
	    
	    //accessing the elements of arrayList1 using for loop
	    
	    for(int i = 0; i < arrayList1.size(); i++) {
	    	
	    	System.out.println(arrayList1.get(i));
	    }
	    
	    
	    
      //accessing the elements of arrayList1 using for each loop
	    
	    for(Integer element: arrayList1){
	    	
	    	System.out.println(element);	
	    
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}


//SOLID principles:
/* D -> Dependency inversion principle
 * List -> is an abstraction (its an interface) and ArrayList is a concrete implementation (it has details)
 * 
 * Why is the second approach preferred as compared to the first approach ?
 * 
 * the second approach gives you more flexibility to change the implementation later on, ex. can change to LinkedList or Vector etc.
 * the second approach also promotes loose coupling which promotes maintainability and flexibility of the code
 * it follows best practices which is to rely on abstraction and not on concrete implementation such as using a class. for ex. ArrayList
 * 
 *
 * ArrayList<Integer> arrayList = new ArrayList<>();
 * this arrayList object can call methods from both List and any specific methods in the ArrayList
 *  trimToSize() method and ensureCapacity() method are some methods specific to the ArrayList class.  
 *  
 *  
 *  List<Integer> arrayList1 = new ArrayList<>();
 *  arrayList1 can call methods only from the List class and will not have access to ArrayList specific methods
 *  
 * ArrayList preserves insertion order
 * it allows null values
 * it allows duplicates
 * it even allows duplicate null values.
 * 
 * 
 * in arrays we use array[0] to access first element
 * in ArrayList we use arrayList1.get(0) or arrayList1.getFirst()
 * 
 * 
 * 
 * 
 * array.length -> to find the length of an array
 * arrayList.size()  -> to find the size (length) of an ArrayList
*/