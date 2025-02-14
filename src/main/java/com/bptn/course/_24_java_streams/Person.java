package com.bptn.course._24_java_streams;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	//instance variables
	int id;
	String name;
	double salary;
	

	public Person(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		
		//create an ArrayList to store Person objects
		
		List<Person> arrayList = new ArrayList<Person>();
		
		
		//populate the ArrayList
		
		arrayList.add(new Person(1,"John", 2500));
		arrayList.add(new Person(2,"Alex", 3500));
		arrayList.add(new Person(3,"Alice", 4500));
		arrayList.add(new Person(4,"Bob", 5500));
		arrayList.add(new Person(5,"Sarah", 6500));
		
		//convert ArrayList to Stream
		
		arrayList.stream()
				 .filter((element)-> element.getSalary()>3000)
				 .forEach((element)-> System.out.println(element));
		
		
		//or
		
		arrayList.stream()
		 	     .filter((element)-> element.getSalary()>3000)
		 	     .forEach(System.out :: println);  //using method references
		
		
		//to get names printed
		
		arrayList.stream()
		         .filter((element)-> element.getSalary()>3000)
		         .forEach((element)-> System.out.println(element.getName()));
		
		//to implement map to print the names
		
		arrayList.stream()
		         .filter((element)-> element.getSalary()>3000)
		         .map((element) -> element.getName())
		         .forEach((element)-> System.out.println(element));	    
		
		
		//to implement map to print the names using method reference
		
		arrayList.stream()
				 .filter((element)-> element.getSalary()>3000)
				 .map(Person :: getName)
				 .forEach(System.out :: println);	    
		
		
		
		
		
		

	}

}
