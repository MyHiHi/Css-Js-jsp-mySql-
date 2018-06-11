package com.zt.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBUtil {
	public static Connection  getConnection(){
		Connection conn=null;
//		1.¼ÓÔØÇý¶¯
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeConnection(Connection conn) {
		try {
			if (conn!=null){
				conn.close();
				conn = null;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void closePreparedStatement(PreparedStatement prep) {
		try {
			if (prep!=null){
				prep.close();
				prep = null;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void closeResultSet(ResultSet  rs) {
		try {
			if (rs!=null){
				rs.close();
				rs = null;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeStatement(Statement  stat) {
		try {
			if (stat!=null){
				stat.close();
				stat = null;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeResultSetAndStatementAndConnection(ResultSet rs,Statement stat,Connection conn){
		closeResultSet(rs);
		closeStatement(stat);
		closeConnection(conn);
	}
	
	public static void closePreparedStatementAndConnection(PreparedStatement prep,Connection conn){
		closePreparedStatement(prep);
		closeConnection(conn);
	}
	public static PreparedStatement getPreparedStatement(Connection conn,String sql){
		PreparedStatement prep=null;
		try {
			prep = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prep;
	}
	
	public static ResultSet getResultSet(Statement stat,String sql){
		ResultSet rs=null;
		try {
			rs = stat.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public static Statement getStatement( Connection conn){
		Statement stat=null;
		try {
			stat = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stat;
	}
	
	
	
}
