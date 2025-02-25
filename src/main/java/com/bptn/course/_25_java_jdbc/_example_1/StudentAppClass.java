package com.bptn.course._25_java_jdbc._example_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentAppClass {
	
	
	
	//DB connection details
	
	
	private static final String userName="postgres";
	private static final String password="pg123";
	private static final String dbName="bptn";
	private static final String port="5432";
	private static final String dbUrl="localhost";
	
	
	//Establish the connection from the Java application to the database
	
	
	public Connection createConnection() {
		
		Connection conn = null;
		
		
		try {
			
			// These lines load the postgresql driver, then initialize it with the variables we defined above:
		    //Class.forName("org.postgresql.Driver");
			
			//this is HOW TO BUILD the  database URL: "jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName 
			//jdbc:postgresql://localhost:5432/bptn -> constructed URL
			
			
			conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName , userName, password);
			
			
		} catch (SQLException e) {
			
			 System.out.println(e.getClass().getName() + ": " + e.getMessage());
			 System.exit(0);
			
		}
		
		
		  System.out.println("Opened database successfully");
		  return conn;
	}
	
	
	//retrieve all the students records from the "students" table
	
	public void getAllStudents(Connection conn) {
		
		
		
		try {
			Statement stmt = null;
			stmt = conn.createStatement();
			
			String sql = "SELECT * from students";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				 // Retrieve by column name
			      System.out.print("Student ID: " + rs.getInt("studentId"));
			      System.out.print(", Course ID: " + rs.getInt("courseId"));
			      System.out.print(", Student Name: " + rs.getString("studentName"));
			      System.out.print(", Student Email: " + rs.getString("studentEmail"));
			      System.out.println(", Student Phone: " + rs.getString("studentPhone"));
				
				
			}
			
			//close the statement
			stmt.close();
			
		} catch (SQLException ex) {
			
			// And of course, we handle exceptions in case our query is unsuccessful: 
		    System.out.println("Exception:" + ex.getMessage());
			
			
		}	
	}
	
	
	//retrieve the student record using studentId
	
	public void getStudentById(Connection conn, Integer studentId) {
		
			
		try {
			
			PreparedStatement stmt = null;
			
			String sql = "SELECT * FROM students WHERE \"studentId\"=?";
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, studentId); //set the first parameterIndex to studentId parameter
			
			ResultSet rs = stmt.executeQuery();
			
			 while (rs.next()) {
			      System.out.print("Student ID: " + rs.getInt("studentId"));
			      System.out.print(", Course ID: " + rs.getInt("courseId"));
			      System.out.print(", Student Name: " + rs.getString("studentName"));
			      System.out.print(", Student Email: " + rs.getString("studentEmail"));
			      System.out.println(", Student Phone: " + rs.getString("studentPhone"));
			    }
			    stmt.close();
			  } catch (SQLException ex) {
			    System.out.println("Exception:" + ex.getMessage());
			  }
			
	}
	
	
	
	//insert a student record into students table
	
	public void addStudent(Connection conn, int courseId, String studentName, String studentEmail, String studentPhone) {
		
		
		try {
			
			PreparedStatement stmt = null;
			
			String sql = "INSERT INTO students(\"courseId\", \"studentName\", \"studentEmail\", \"studentPhone\") VALUES(?,?,?,?)";
			
			stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, courseId); //set the first parameterIndex to courseId parameter
			stmt.setString(2, studentName); //set the second parameterIndex to courseId parameter
			stmt.setString(3, studentEmail);  //set the first parameterIndex to courseId parameter
			stmt.setString(4, studentPhone); //set the first parameterIndex to courseId parameter
			
			int resultCount = stmt.executeUpdate(); //the number if records that is inserted
			
			System.out.println(resultCount +" record(s) inserted");
			
			stmt.close();
			
			  } catch (SQLException ex) {
			    System.out.println("Exception:" + ex.getMessage());
			  }

	}
	
	
	//close the connection
	
	public boolean closeConnection(Connection conn) {
		
		boolean flag = true;
		
		
		try {
			conn.close();
		} catch (SQLException ex) {
			
			flag = false;
			System.out.println("Exception:" + ex.getMessage());
			
		}
		return flag;
	}

}
