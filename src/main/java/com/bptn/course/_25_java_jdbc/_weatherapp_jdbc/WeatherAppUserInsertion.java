package com.bptn.course._25_java_jdbc._weatherapp_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WeatherAppUserInsertion {
	
	// DB connection details
			private static final String userName = "doadmin";
			private static final String password = "AVNS_SQ_qmkEt_URAoujz92Y";
			private static final String dbName = "weatherDB";
			private static final String port = "25060";
			private static final String dbUrl = "academydb-c7-s1-t6-do-user-12484302-0.h.db.ondigitalocean.com";
			
			
		//Create method createConnection()
			public Connection createConnection() {
				
				Connection conn= null;
				
				try {
					Class.forName("org.postgresql.Driver");
					conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,
							password);
					
				}catch (Exception e){
					System.out.println(e.getClass().getName() + ": " + e.getMessage());
					System.exit(0);
				}
				System.out.println("Opened database successfully");
				return conn;
			}
			
		//Create method called add user
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
					
					int resultCount = stmt.executeUpdate(); // the number of records that is inserted
					System.out.println(resultCount + " record(s) inserted");
				
					stmt.close();
				
				}catch (SQLException ex) {
					// handle exception
		            System.out.println("Exception:" + ex.getMessage());
				}
			}
			// Close the connection
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
