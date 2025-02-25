package com.bptn.course._25_java_jdbc._feedapp_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FeedAppClass {
	
	//DB connection details
	
	
		private static final String userName="postgres";
		private static final String password="pg123";
		private static final String dbName="feedApp";
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
		
		
		
		//method to add a user into the "User" table
		
		
		public void addUser(Connection conn, String firstName, String lastName, String username, String phone,String emailId, String password, boolean emailVerified) {
			
			
			try {
				
				PreparedStatement stmt = null;
				
				String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
				
				stmt = conn.prepareStatement(sql);
				
				stmt.setString(1, firstName);
				stmt.setString(2, lastName);
				stmt.setString(3, username);
				stmt.setString(4, phone);
				stmt.setString(5, emailId);
				stmt.setString(6, password);
				stmt.setBoolean(7, emailVerified);
				
				
				int resultCount = stmt.executeUpdate();
				
				System.out.println(resultCount +" record(s) inserted");
				
				
			} catch (SQLException ex) {
				System.out.println("Exception:" + ex.getMessage());
			}
			
		}
		
		//retrieve all the user records from the "users" table
		
		public void getAllUsers(Connection conn) {	
			
			try {
		
				Statement stmt = null;
				
				stmt = conn.createStatement();
				
				String sql = "SELECT * FROM \"User\"";
				
				ResultSet rs = stmt.executeQuery(sql);
				

				
				while(rs.next()) {
					
					 // Retrieve by column name
					  System.out.print("User ID: " + rs.getInt("userId"));
				      System.out.print(", First Name: " + rs.getString("firstName"));
				      System.out.print(", Last Name: " + rs.getString("lastName"));
				      System.out.print(", Username: " + rs.getString("username"));
				      System.out.print(", Phone: " + rs.getString("phone"));
				      System.out.print(", Email ID: " + rs.getString("emailId"));
				      System.out.print(", Password: " + rs.getString("password"));
				      System.out.print(", Email Verified?: " + rs.getBoolean("emailVerified"));
				      System.out.println("Created On: " + rs.getTime("createdOn"));
				
					
					
				}
				
				//close the statement
				stmt.close();
				
			} catch (SQLException ex) {
				
				// And of course, we handle exceptions in case our query is unsuccessful: 
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
