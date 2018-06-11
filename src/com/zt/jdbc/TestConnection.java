package com.zt.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class TestConnection {

	/**
	 * @param args
	 * 1.导入jar
	 * 2. 编码
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
//		1.加载驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.创建连接
		java.sql.Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");
//		3.编写数据库语句
		
		String sql = "";
	}

}
