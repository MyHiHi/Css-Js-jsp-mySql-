package com.zt.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class TestConnection {

	/**
	 * @param args
	 * 1.����jar
	 * 2. ����
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * 
	 */
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		1.��������
		Class.forName("com.mysql.jdbc.Driver");
//		2.��������
		java.sql.Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");
//		3.��д���ݿ����
		
		String sql = "";
	}

}
