package com.bptn.course.big_coding_2.person_class;

public class Person {
	
	
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private String ssn;	
	


	Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
		this.ssn = ssn;
	}

	
	
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	public int getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}


	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

    public boolean verifySSN(String ssn) {
    	if(this.ssn.equals(ssn)) {
    		return true;
    	}
    	return false;
    	
    }
    
    public String getBirthday() {
    	return this.birthDay +"/"+ this.birthMonth + "/" + this.birthYear; 
    }

	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}






	public static void main(String[] args) {
		
		Person person1 = new Person("John", "Doe", 1, 1, 1990, "123-45-6789");
        Person person2 = new Person("Jane", "Doe", 2, 2, 1991, "987-65-4321");
        Person person3 = new Person("Jane", "Smith", 1, 1, 1990, "111-11-1111");
        Person person4 = new Person("Jane", "Smith", 2, 2, 1991, "222-22-2222");
        
        System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName() + " Birthday: " + person1.getBirthday() + " SSN: " + person1.verifySSN("123-45-6789"));
        System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName() + " Birthday: " + person2.getBirthday() + " SSN: " + person2.verifySSN("987-65-4321"));
        System.out.println("Person 3: " + person3.getFirstName() + " " + person3.getLastName() + " Birthday: " + person3.getBirthday() + " SSN: " + person3.verifySSN("111-11-1111"));
        System.out.println("Person 4: " + person4.getFirstName() + " " + person4.getLastName() + " Birthday: " + person4.getBirthday() + " SSN: " + person4.verifySSN("222-22-2222"));
    
		
	}

}
