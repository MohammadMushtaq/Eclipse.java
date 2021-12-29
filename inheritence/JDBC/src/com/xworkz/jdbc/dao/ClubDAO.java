package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.DBconstants.ClubConstants;
import com.xworkz.jdbc.dto.ClubDTO;

public class ClubDAO {
	
	public boolean save(ClubDTO cluDto) {
		
		try {
			
			Class.forName(ClubConstants.DRIVER);
			Connection mysql = DriverManager.getConnection(ClubConstants.MY_URL,ClubConstants.USERNAME,ClubConstants.PASSWORD);
			Statement statement= mysql.createStatement();
			String sql="insert  into clubDetails values("+cluDto.getId()+",'"+cluDto.getName()+"','"+cluDto.getLocation()+"',"+cluDto.getBouncers()+")";
			int rowEffected=statement.executeUpdate(sql);
			System.out.println(rowEffected);
			if(rowEffected == 1) {return true;}
			} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteById(int id) {
		try {
			Class.forName(ClubConstants.DRIVER);
			Connection mysql=DriverManager.getConnection(ClubConstants.MY_URL,ClubConstants.USERNAME,ClubConstants.PASSWORD);
			Statement statement=mysql.createStatement();
			 String sql = "delete from clubDetails where cid=2";
			int rowDelete=statement.executeUpdate(sql);
		//	if(rowDelete == 1) return true;
		//	System.out.println(rowDelete);
			 	return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
