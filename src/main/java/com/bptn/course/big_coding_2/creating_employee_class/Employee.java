package com.bptn.course.big_coding_2.creating_employee_class;

public class Employee {
	
	private int salary;
	private int hoursPerDay;
	
	
	
	Employee(int salary, int hoursPerDay) {
		setSalary(salary);
		setHoursPerDay(hoursPerDay);
		
	}



	public int getSalary() {
		return this.salary;
	}



	public void setSalary(int salary) {
		if(salary<500) {
			this.salary = salary+10;
		} else {
			this.salary = salary;
		}
	}



	public int getHoursPerDay() {
		return hoursPerDay;
	}



	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
		if(hoursPerDay > 6) {
			this.salary += 5;
		}
	}
	
	




	


	

}
