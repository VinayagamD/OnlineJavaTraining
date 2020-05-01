package com.vinay.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vinay.dao.DBConnectionManager;
import com.vinay.dao.LoginDao;

public class LoginDoaImpl implements LoginDao {

	@Override
	public boolean login(String userName, String password) {
		String sql = "SELECT * FROM users WHERE username=? AND password=?;";
		try(Connection connection = DBConnectionManager.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);){
			statement.setString(1, userName);
			statement.setString(2, password);
			return statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
