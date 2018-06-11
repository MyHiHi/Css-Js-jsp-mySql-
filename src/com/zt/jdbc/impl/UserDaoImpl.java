package com.zt.jdbc.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import java.sql.Statement;

import java.sql.PreparedStatement;
import com.zt.jdbc.dao.IUserDao;
import com.zt.jdbc.projo.User;
import com.zt.jdbc.util.DBUtil;
import com.zt.jdbc.util.RandomTime;

public class UserDaoImpl implements IUserDao {

	Connection conn = DBUtil.getConnection();
	Statement stat = DBUtil.getStatement(conn);
	@Override
	public List<User> findAll() {
		List<User> users = null;
		try {
			String sql = "select * from users";
			users = new ArrayList<User>();
			ResultSet rs = DBUtil.getResultSet(stat, sql);
			while (rs.next()){
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("userName"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setAddr(rs.getString("addr"));
				user.setRdate(rs.getTimestamp("rdate"));
				users.add(user);	
			}
			DBUtil.closeResultSetAndStatementAndConnection(rs, stat, conn);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public  int addUser(User user) {
		Connection conn = DBUtil.getConnection();
		int count=0;
		String sql = "insert into users values(null,?,md5(?),?,?,now())";
		PreparedStatement prep = DBUtil.getPreparedStatement(conn, sql);
		try {
			prep.setString(1, user.getUserName());
			prep.setString(2, user.getPassword());
			prep.setString(3, user.getAddr());
			prep.setString(4, user.getPhone());
			
			count =  prep.executeUpdate();
			DBUtil.closePreparedStatementAndConnection(prep, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	

	public  int addUser2(User user) {
		Connection conn = DBUtil.getConnection();
		int count=0;
		String sql = "insert into users values(null,?,md5(?),?,?,?)";
		PreparedStatement prep = DBUtil.getPreparedStatement(conn, sql);
		try {
			prep.setString(1, user.getUserName());
			prep.setString(2, user.getPassword());
			prep.setString(3, user.getAddr());
			prep.setString(4, user.getPhone());
			prep.setTimestamp(5, user.getRdate());
			count =  prep.executeUpdate();
			DBUtil.closePreparedStatementAndConnection(prep, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int deleteUser(Integer id) {
		int count = 0;
		String sql = "delete from users where id = "+id;
		PreparedStatement prep = DBUtil.getPreparedStatement(conn, sql);
		try {
			count =  prep.executeUpdate();
			DBUtil.closePreparedStatementAndConnection(prep, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int updateUser(User user) {
		int count = 0;
		Connection conn = DBUtil.getConnection();
		Statement stat = DBUtil.getStatement(conn);
		String sql = "update users set userName = ?, password = md5(?)"+
		",phone = ?,addr = ? where id = ?";
		PreparedStatement prep = DBUtil.getPreparedStatement(conn, sql);
		try {
			prep.setString(1, user.getUserName());
			prep.setString(2, user.getPassword());
			prep.setString(3, user.getPhone());
			prep.setString(4, user.getAddr());
			prep.setInt(5, user.getId());
			
			count =  prep.executeUpdate();
			DBUtil.closePreparedStatementAndConnection(prep, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;

	}

	@Override
	public User findUserById(Integer id) {
		String sql = "select * from users where id = "+id;
		ResultSet rs = DBUtil.getResultSet(stat, sql);
		User user = null;
		try {
			if (rs.next()){
				user = new User();
				user.setId(id);
				user.setUserName(rs.getString("userName"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setAddr(rs.getString("addr"));
				user.setRdate(rs.getTimestamp("rdate"));
				
			}
			DBUtil.closeResultSetAndStatementAndConnection(rs, stat, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User findUserByUserName(String userName) {
		String sql = "select * from users where userName = '"+userName+"'";
		ResultSet rs = DBUtil.getResultSet(stat, sql);
		User user = null;
		try {
			if (rs.next()){
				user = new User();
				user.setUserName(rs.getString("userName"));
				user.setPassword(rs.getString("password"));
				user.setPhone(rs.getString("phone"));
				user.setAddr(rs.getString("addr"));
				user.setRdate(rs.getTimestamp("rdate"));
				user.setId(rs.getInt("id"));
				
			}
			DBUtil.closeResultSetAndStatementAndConnection(rs, stat, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	


}


