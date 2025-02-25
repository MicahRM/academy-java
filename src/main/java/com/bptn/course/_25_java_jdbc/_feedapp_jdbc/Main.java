package com.bptn.course._25_java_jdbc._feedapp_jdbc;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub''
		
		FeedAppClass jdbc = new FeedAppClass();
		
		Connection conn = jdbc.createConnection();
		
		//jdbc.addUser(conn, "Ray", "Mist", "raymist", "1233444", "ray@mist.com", "Rayertew", true);
		
		
		
		jdbc.getAllUsers(conn);
		

		jdbc.closeConnection(conn);
		
	}

}
