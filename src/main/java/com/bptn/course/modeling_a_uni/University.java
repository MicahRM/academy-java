package com.bptn.course.modeling_a_uni;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class University {
	
	// property - get inspired by the UML diagram
	
	
	
	ArrayList<Student> university = new ArrayList<>();
	
	
	
	

	public ArrayList<Student> students() {
		
		return university;
		
	}

    public void addStudent(Student s) {
        // add a student to the "university" arraylist
    	
    	Date bDate = new Date(1,4,1999);
    	
    	Date oDate = new Date(1,4,2222);
    	
    	university.add(s);
    	
    	
    	
    	//Student s1 = new Student(587592757,"s1UserName", "passwordnull", "Joe", "Schmoe", "jschmoe@yahoo.com", "123-4345-666", "123 hughh way", "Male", bDate, oDate, 987654347, "Software Eng");
    			
         //university.add(s1);
    }

    public Student getStudent(long studentId) {
      // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
    	Student foundStudent = null;
    	
    	for (Student student : university) {
    		if(student.getStudentId() == studentId);{
    			 foundStudent = student;
    		}
		}
    	
     return foundStudent;	
    }

    public List<Student> searchStudent(String userNamePrefix) {
       // return all students that have usernames beginning with the prefix 
    	
     Student foundStudent1 = null;
     
     List<Student> foundStudents = new ArrayList<Student>();
    	
    	for (Student student : university) {
    		String name = student.getUserName();
    	 if(name.startsWith(userNamePrefix)){
    			foundStudent1 = student;
    			 foundStudents.add(foundStudent1);
    		}
		}
   
    	
     return foundStudents;	
    }

    	
    	
    

    public boolean deleteStudent(long studentId) {
    	
    	Student student5 = null;
    	
    	for (Student student : university) {
    		if(student.getStudentId() == studentId);{
    			student5 = student;
    				 
    		}
		}
    	
    	return university.remove(student5);
    	
   	
    }

    }



