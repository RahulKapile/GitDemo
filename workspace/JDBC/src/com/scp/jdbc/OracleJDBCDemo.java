package com.scp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJDBCDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system/rahul@localhost:1521:xe");
		System.out.println("con created");
		Statement stmt = conn.createStatement();
		System.out.println("stmt created");
		ResultSet resultset = stmt.executeQuery("select * from customers");
		System.out.println("query executed");
		
		while(resultset.next())
		{
			System.out.println(" ------");
			System.out.println(" "+resultset.getInt(1));
			

			System.out.println(" ------");

			System.out.println(" "+resultset.getString(2));

			System.out.println(" ------");
			System.out.println(" "+resultset.getString(3));
			
			System.out.println(" ------");



		}
		resultset.close();
		stmt.close();
		conn.close();
	}

}
