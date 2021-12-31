package com.xworkz.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.DBconstants.DBConstants;
import com.xworkz.jdbc.dto.StateDto;

public class StateDao {
	Connection mysql;
	public boolean save(StateDto stateDto) {
		
		try {
				DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME, DBConstants.PASSWORD);
				if (!mysql.isClosed()) {
				// String sql="insert into State_details
				// values("+stateDto.getId()+",'"+stateDto.getName()+"',"+stateDto.getCode()+",'"+stateDto.getCapital()+"')";
				// Statement s=mysql.createStatement();
				String sql = "insert into stateDto values(?,?,?,?)";
				PreparedStatement preparedStatement = mysql.prepareStatement(sql);
				preparedStatement.setObject(1, stateDto.getId());
				preparedStatement.setObject(2, stateDto.getName());
				preparedStatement.setObject(3, stateDto.getCode());
				preparedStatement.setObject(4, stateDto.getCapital());

				int rowEffected = preparedStatement.executeUpdate();
				System.out.println(rowEffected);
				if (rowEffected == 1)
					return true;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (mysql.isClosed())
					;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean deleteById(int id) {
		try {
			Class.forName(DBConstants.DRIVER);
			Connection mysql = DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME,
					DBConstants.PASSWORD);
			Statement statement = mysql.createStatement();
			String sql = "delete from State_details where s_id=" + id;
			int rowDelete = statement.executeUpdate(sql);
			return true;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	public boolean displayById(int gid) {

		try {
			Connection mysql = DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME,
					DBConstants.PASSWORD);
			// DBUtil.connectingmysql();
			String sql = "select*from State_details where s_id=" + gid;
			PreparedStatement stmt = mysql.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				Object obj1 = result.getObject(1);
				System.out.println(obj1);
				Object obj2 = result.getObject(2);
				System.out.println(obj2);
				Object obj3 = result.getObject(3);
				System.out.println(obj3);
				Object obj4 = result.getObject(4);
				System.out.println(obj4);

			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean displayAll() {

		try {
			Connection mysql = DriverManager.getConnection(DBConstants.MY_URL, DBConstants.USERNAME,
					DBConstants.PASSWORD);
			// DBUtil.connectingmysql();
			String sql = "select*from State_details";
			PreparedStatement stmt = mysql.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				Object obj1 = result.getObject(1);
				System.out.println(obj1);
				Object obj2 = result.getObject(2);
				System.out.println(obj2);
				Object obj3 = result.getObject(3);
				System.out.println(obj3);
				Object obj4 = result.getObject(4);
				System.out.println(obj4);

			}
			return true;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;

	}
}
