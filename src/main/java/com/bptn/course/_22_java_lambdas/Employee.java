package com.bptn.course._22_java_lambdas;

import java.util.ArrayList;

public class Employee {
	
	//Creating the instance variables
		private int id;
		private String name;
		private double salary;
		
		//Creating the employee constructor 
		Employee(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		//Generating Getters
		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public Double getSalary() {
			return salary;
		}
		
		//Overriding the to-string method
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

		public static void main(String[] args) {
			//Creating an Array list to store employee objects 
			ArrayList<Employee> employees = new ArrayList<>();
			
			//Creating Employee objects
			Employee emp = new Employee(110, "Jack Robinson", 1000);
			Employee emp1 = new Employee(111, "Tom John", 1200);
			Employee emp2 = new Employee(112, "Sally Bello", 1300);
			Employee emp3 = new Employee(113, "Hornet Jullie", 1080);
			Employee emp4 = new Employee(114, "Pat Harry", 1800);

			//Adding employee objects to the Array List.
			employees.add(emp1);
			employees.add(emp2);
			employees.add(emp3);
			employees.add(emp4);
			employees.add(emp);

			// Lambda function to sort the employees based on their salary in descending
			employees.sort((e1, e2) -> e2.getSalary().compareTo(e1.getSalary())) ;
			
			// Printing sorted employees
			System.out.println("Employees sorted by salary (Descending Order):");
			employees.forEach(employee -> System.out.println(employee.toString()));

		}

}
