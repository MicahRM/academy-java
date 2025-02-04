package com.bptn.course._14_java_collections._01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	
	
	 public static void main(String[] args) {
		 
		 
		 List<String> toDoList = new ArrayList<>();
		 
		 
		 toDoList.add("Do Homework");
		 toDoList.add("Help me make dinner");
		 toDoList.add("Call Grandma");
		 
		 
		 toDoList.set(1, "Order Pizza");
		 
		 
		 System.out.println(toDoList.size()+ " things to do!");
		 
		 
		 
		 System.out.println("Here's the first thing to do: " + toDoList.get(0));
		 
		 
		 toDoList.remove(0);	
		 
		 
		 System.out.println("Here's the next thing to do: " + toDoList.get(0) );
		 
		 
		 



//	      // Rewrite this code to use an ArrayList instead of an array
//	      String[] toDoList = new String[3];
//	      toDoList[0] = "Do homework";
//	      toDoList[1] = "Help make dinner";
//	      toDoList[2] = "Call grandma";
//
//	      // changing element at index 1
//	      toDoList[1] = "Order pizza";
//
//	      System.out.println(toDoList.length + " things to do!");
//	      System.out.println("Here's the first thing to do: "
//	           + toDoList[0] );
//
//	      // remove item 0 and move everything down
//	      //  (this can be done in 1 command with ArrayList)
//	      toDoList[0] = toDoList[1];
//	      toDoList[1] = toDoList[2];
//	      toDoList[2] = "";
//
//	      System.out.println("Here's the next thing to do: "
//	           + toDoList[0] );
		 
		 
		 
		 
	 }
	 
	 
}