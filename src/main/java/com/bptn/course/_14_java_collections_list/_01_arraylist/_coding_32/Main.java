package com.bptn.course._14_java_collections_list._01_arraylist._coding_32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		 List<Student> studentList = new ArrayList<>();

	        studentList.add(new Student("Student1", 80));
	        studentList.add(new Student("Student2", 75));
	        studentList.add(new Student("Student3", 86));
	        studentList.add(new Student("Student4", 74));
	        studentList.add(new Student("Student5", 92));
	        studentList.add(new Student("Student6", 72));
	        studentList.add(new Student("Student7", 60));

	        // initialize passList
	        List<Student> passList = new ArrayList<>();

	        // Loop through studentlist to filter the students with target grade
	        
	        for(int i = 0; i<studentList.size(); i++) {
	        	
	        	if(studentList.get(i).getClassGrade() >= 75) {
	        		passList.add(studentList.get(i));
	        		
	        		
	        	}
	        }
	        
	        
	        //for-each loop doing the same thing
	        
	        for(Student s : studentList) {
	        	
	        	if(s.getClassGrade() >= 75) {
	        		passList.add(s);
	        		
	        	}
	        }
	        
	        
	        
	        
	        // print out the students using a for-each loop.
	        
	        for(Student s : passList) {
	        	System.out.println(s);
	        }
	        
	        

	}

}

//i = 0
//studentList.get(0) => Student1, 80
//studentList.get(0.getClassGrade() => 80


//i = 1
//studentList.get(0) => Student1, 75
//studentList.get(0.getClassGrade() => 75


//i = 2
//studentList.get(0) => Student1, 86
//studentList.get(0.getClassGrade() => 86
