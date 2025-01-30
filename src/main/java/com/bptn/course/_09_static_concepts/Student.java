package com.bptn.course._09_static_concepts;

import java.security.PrivateKey;

public class Student {
	
	private String name;
	private int grade;
	
	private static String principalName = "Ms.Mckoy";
	
	private String studentID;
	
	private static int nextID = 100;
	
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		this.studentID = name.toUpperCase().charAt(0) + String.valueOf(nextID);
		nextID++;
	}
	
	public static void newPrincipal(String newPrincipal){
		principalName = newPrincipal;
	}
	
	public static void resetID(){
		nextID = 100;
	}
	
	
	public String toString(){
		return this.name + " " + this.studentID;
	}
	
	


	public static void main(String[] args) {
		Student s1 = new Student("Muhammed", 11);
        Student s2 = new Student("Alan", 11);
        Student s3 = new Student("Sophie", 11);

        System.out.println("Principal Name for student 1: " + Student.principalName);
        System.out.println("Student ID for student 1: " + s1.studentID);
        System.out.println("Student ID for student 2: " + s2.studentID);
        System.out.println("Student ID for student 3: " + s3.studentID);

        Student.newPrincipal("Mr. McKoy");
        System.out.println("New principal name: " + Student.principalName);

        Student.resetID();
        Student s4 = new Student("kevin", 11);
        System.out.println("Student ID for student 4: " + s4.studentID);
        System.out.println("String representation of student 4: " + s4.toString());
   	

	}

}
