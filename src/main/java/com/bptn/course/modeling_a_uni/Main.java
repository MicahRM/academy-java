package com.bptn.course.modeling_a_uni;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		 // Start by looking in the University and Student classes. Implement the methods. 

        // Create a bunch of student objects 
            // (Make sure one student has the following studentId: 123)
            // (Make sure one other student has the following username: testUsername1)
		
        Date bDate = new Date(1,4,1999);
    	
    	Date oDate = new Date(1,4,2222);
    	
		
		Student s9 = new Student(587592757,"sgge", "passwordnull", "Joe", "Schmoe", "jschmoe@yahoo.com", "123-4345-666", "123 hughh way", "Male", bDate, oDate, 987654347, "Software Eng");
		
		Student s7 = new Student(123,"shgv", "passwordnull", "Joe", "Schmoe", "jschmoe@yahoo.com", "123-4345-666", "123 hughh way", "Male", bDate, oDate, 987654347, "Software Eng");
		
		Student s6 = new Student(587592757,"shce", "passwordnull", "Joe", "Schmoe", "jschmoe@yahoo.com", "123-4345-666", "123 hughh way", "Male", bDate, oDate, 987654347, "Software Eng");
		
		Student s4 = new Student(587592757,"testUsername1", "passwordnull", "Joe", "Schmoe", "jschmoe@yahoo.com", "123-4345-666", "123 hughh way", "Male", bDate, oDate, 987654347, "Software Eng");
		
		Student s0 = new Student(587592757,"schb", "passwordnull", "Joe", "Schmoe", "jschmoe@yahoo.com", "123-4345-666", "123 hughh way", "Male", bDate, oDate, 987654347, "Software Eng");
		

        // Create instance of university called "university" and populate it with the students.
		
		University university = new University();
		
		//ArrayList<Student> university = new ArrayList<>();
		
		
		university.addStudent(s0);
		university.addStudent(s4);
		university.addStudent(s6);
		university.addStudent(s7);
		university.addStudent(s9);

        System.out.println("\nUniversity ------ \n" + university.students());
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.students());

		
		
		

	}

}
