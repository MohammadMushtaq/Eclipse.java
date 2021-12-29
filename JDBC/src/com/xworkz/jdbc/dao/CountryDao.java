package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.DBconstants.DBConstants;
import com.xworkz.jdbc.dto.CountryDto;


public class CountryDao {
public boolean save(CountryDto countryDto) {
		
		try {
			Class.forName(DBConstants.DRIVER);
			Connection mysql=DriverManager.getConnection(DBConstants.MY_URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			
			String sql="insert  into country_details  values("+countryDto.getId()+",'"+countryDto.getName()+"',"+countryDto.getCode()+",'"+countryDto.getContinent()+"')";
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
	}public boolean deleteById(int id) {
		try {
			Class.forName(DBConstants.DRIVER);
			Connection mysql=DriverManager.getConnection(DBConstants.MY_URL,DBConstants.USERNAME,DBConstants.PASSWORD);
			Statement statement=mysql.createStatement();
			 String sql = "delete from country_details where c_id=1";
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
