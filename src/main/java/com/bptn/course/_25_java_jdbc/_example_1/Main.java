package com.bptn.course._25_java_jdbc._example_1;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		
		StudentAppClass jdbc = new StudentAppClass();
		
		Connection conn = jdbc.createConnection();
		
		jdbc.getAllStudents(conn);
		
		//jdbc.getStudentById(conn, 1);
		
		jdbc.addStudent(conn, 1, "RayMist", "raymis@ex.com", "47373737");
		
		jdbc.closeConnection(conn);
		

	}

}
