package com.bv.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bv.connection.DBconnect;

public class LoginService
{
	  
	  

public static boolean validateUser(String username, String password)
{
	boolean status = false;
	String sql = "select * from account "
			+ "where acc_no = ? and password = ?";
	Connection con = DBconnect.getConnection();
	try {
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
	ResultSet rs = pstmt.executeQuery();
	
	if(rs.next())
	status = true;


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return status;
	
}

public static boolean validateUser1(String username, String password)
{
	boolean status = false;
	String sql = "select * from LoginDetails "
			+ "where username = ? and password = ?";
	Connection con = DBconnect.getConnection();
	try {
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
	ResultSet rs = pstmt.executeQuery();
	
	if(rs.next())
	status = true;


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return status;
	
}
}
