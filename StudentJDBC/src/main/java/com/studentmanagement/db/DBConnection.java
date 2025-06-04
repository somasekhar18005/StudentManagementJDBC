package com.studentmanagement.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	
	static Connection con;
	
	public static Connection createConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root";
			String pass="root";
			String url="jdbc:mysql://127.0.0.1:3306/Student?user=root&password=root";
			
			
			con=DriverManager.getConnection(url,user,pass);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return con;
	}
	
}
