package com.bv.model;

public class LoginDetails {
	private int acc_no;
	private String username;
	private String password;
	
	
	public LoginDetails(int acc_no, String username, String password) {
		super();
		this.acc_no = acc_no;
		this.username = username;
		this.password = password;
	}
	
	
	public LoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
