package com.JPMorgan.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Enter 1 for insert a recorrd");
		System.out.println("Enter 2 for delete a recorrd");
		System.out.println("Enter 3 for update a recorrd");
		System.out.println("Enter 4 for display a recorrd");
		System.out.println("Enter 5 for display all recorrd");
		int reply = scan.nextInt();
		switch(reply) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid input");
		}
		} while (true);
	}
}
