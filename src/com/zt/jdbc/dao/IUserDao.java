package com.zt.jdbc.dao;

import java.util.List;

import com.zt.jdbc.projo.User;

public interface IUserDao {
	List<User> findAll();
	int addUser(User user);
	int deleteUser(Integer id);
	int updateUser(User user);
	User findUserById(Integer id);
	User findUserByUserName(String userName);
}
