package com.xworkz.jdbc.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.DBconstants.ClubConstants;
import com.xworkz.jdbc.DBconstants.FestivalConstant;
import com.xworkz.jdbc.dao.FestivalDto;

public class FestivalDao {

	public boolean save(FestivalDto festivalDto) {
		
		try {
			Class.forName(FestivalConstant.DRIVER);
			Connection mysql=DriverManager.getConnection(FestivalConstant.MY_URL,FestivalConstant.USERNAME,FestivalConstant.PASSWORD);
			
			String sql="insert  into festival_details  values("+festivalDto.getId()+",'"+festivalDto.getName()+"',"+festivalDto.getDate()+",'"+festivalDto.getState()+"')";
			Statement s=mysql.createStatement();
			System.out.println(sql);
			int rowEffected=s.executeUpdate(sql);
			
			if(rowEffected==1) return true;
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;		
	}
	public boolean deleteById(int id) {
		try {
			Class.forName(FestivalConstant.DRIVER);
			Connection mysql=DriverManager.getConnection(FestivalConstant.MY_URL,FestivalConstant.USERNAME,FestivalConstant.PASSWORD);
			Statement statement=mysql.createStatement();
			 String sql = "delete from festival_details where f_id=2";
			int rowDelete=statement.executeUpdate(sql);
			return true;
				 	
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
