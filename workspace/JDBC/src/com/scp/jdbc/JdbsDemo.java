package com.scp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbsDemo 
{
 public static void main(String[] args) throws ClassNotFoundException, SQLException 
 {
	Class.forName("org.hsqldb.jdbcDriver");
	Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/","SA","");
	Statement stat = conn.createStatement();
	
	ResultSet resultset = stat.executeQuery("");
	
//	while(resultset.next())
//	{
//		System.out.println(" ");
//		System.out.println(" "+resultset.getInt(""));
//		System.out.println(" "+resultset.getString(""));
//		System.out.println(" "+resultset.getString(""));
//		System.out.println(" "+resultset.getInt(""));
//	}
	
//	resultset.close();
//	conn.close();
//	stat.close();
 }
}
