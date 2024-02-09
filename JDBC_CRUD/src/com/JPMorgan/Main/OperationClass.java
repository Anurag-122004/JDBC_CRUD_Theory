package com.JPMorgan.Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OperationClass {
	Scanner scan = new Scanner (System.in);
	ConnectionClass connectionObject = new ConnectionClass();
	Connection con = null;
	public void insert_record() throws ClassNotFoundException, SQLException {
		System.out.println("Enter student UID:");
		String studentUID = scan.next();
		System.out.println("Enter student name");
		String studentName = scan.nextLine();
		System.out.println("Enter student course");
		String studentCourse = scan.nextLine();
		System.out.println("Enter student batch");
		int studentBatch = scan.nextInt();
		
		if (con == null) {
			con = connectionObject.getConnection();	
			String insertQuery = "insert into student values(?,?,?,?)";
			
			PreparedStatement psmt = con.prepareStatement(insertQuery);
			psmt.setString(1, studentUID);
			psmt.setString(2, studentName);
			psmt.setString(3, studentCourse);
			psmt.setInt(4, studentBatch);
			
			int status = psmt.executeUpdate(); //select statement and non-select statement two type of queries
			if (status > 0) {
				System.out.println("Record inserted successfully"+status);
			}
			}
	}

}
