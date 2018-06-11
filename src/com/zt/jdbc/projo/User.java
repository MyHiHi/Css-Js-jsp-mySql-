package com.zt.jdbc.projo;

import java.sql.Timestamp;


public class User {
	private Integer id;
	private String userName;
	private String password;
	private String addr;
	private String phone;
	private Timestamp rdate;
	public User(String userName, String password, String addr, String phone,
			Timestamp rdate) {
		super();
		this.userName = userName;
		this.password = password;
		this.addr = addr;
		this.phone = phone;
		this.rdate = rdate;
	}
	public User(String userName, String password, String phone, String addr) {
		super();
		this.userName = userName;
		this.password = password;
		this.addr = addr;
		this.phone = phone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((rdate == null) ? 0 : rdate.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (rdate == null) {
			if (other.rdate != null)
				return false;
		} else if (!rdate.equals(other.rdate))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", addr=" + addr + ", phone=" + phone + ", rdate="
				+ rdate + "]";
	}
	public User() {
		super();
	}
	public User(Integer id, String userName, String password,String phone, String addr,
			 Timestamp rdate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.addr = addr;
		this.phone = phone;
		this.rdate = rdate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Timestamp getRdate() {
		return rdate;
	}
	public void setRdate(Timestamp timestamp) {
		this.rdate = timestamp;
	}
	

	
	
}
