package com.bptn.course.big_coding_4._convert_list_to_map;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	
	

    // create static method "convertStudentListToMap"
	
	public static Map<Integer, Student> convertStudentListToMap(List<Student> list){
		
		                            return list.stream()
											   .collect(Collectors
											   .toMap(Student :: getId, student -> student));  //returns a Map with Integer Keys and Student object values from a given list of Student objects
	}
	
	
	
    // Complete the main method
    public static void main(String[] args) {

        // Create a list of students
    	
    	 List<Student> students = new ArrayList<>();
        
        
        //add student objects to this list
    	 
    	 students.add(new Student(1, "Alice", 20));
    	 students.add(new Student(2, "Bob", 22));
    	 students.add(new Student(3, "Charlie", 21));
        

        // Call "convertStudentListToMap" method and hold the returned value in "studentMap" variable.
    	 
    	 Map<Integer, Student> studentMap = convertStudentListToMap(students);       
        // Print the map
        System.out.println("Students Map: "+ studentMap);
    }

}


/*
 * Summary:
 * 
 *  create static method "convertStudentListToMap"
 *  returns a Map with Integer Keys and Student object values from a given list of Student objects
 *  complete the main method
 *  Create a list of students
 *  add student objects to this list
 *  Call "convertStudentListToMap" method and hold the returned value in "studentMap" variable
 *  Print the map
 * 
 * 
 */




