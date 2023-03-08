package com.tester;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded....");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac22", "root", "root123");
			System.out.println("Connected To DB.....");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
