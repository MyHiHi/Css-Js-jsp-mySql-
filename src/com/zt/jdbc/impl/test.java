package com.zt.jdbc.impl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.zt.jdbc.dao.IUserDao;
import com.zt.jdbc.projo.User;
import com.zt.jdbc.util.RandomTime;

public class test {

	/**
	 * @param args
	 */
	
	private void transform() {
		

	}
	public static void main(String[] args) {
		for (int i=10;i<200;i++){
			String userName = "user"+String.valueOf(i);
			String password = String.valueOf(123+i);
			String phone = "243234"+i;
			String addr = "China";
			Date rdate = RandomTime.randomDate("2018-01-01", "2018-05-22");
			String t1 =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(rdate);
			Timestamp k1 = Timestamp.valueOf(t1);
			User user = new User(userName, password, addr,phone,k1);
			System.out.println(user);
			 
			new UserDaoImpl().addUser2(user);	
		}
		System.out.println("ok");

	}

}
