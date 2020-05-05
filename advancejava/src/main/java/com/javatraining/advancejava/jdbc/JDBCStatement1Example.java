/**
 * 
 */
package com.javatraining.advancejava.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author vinay
 *
 */
public class JDBCStatement1Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Create Connection String
		String url = "jdbc:mysql://localhost:3306/books";
		// 2. ADD USER CREDENTIALS 
		String username = "root";
		String password = "drago";
		String sql = "CALL display_book();";
		try(Connection con = DriverManager.getConnection(url, username, password);
			CallableStatement statement = con.prepareCall(sql);
			ResultSet resultSet = statement.executeQuery();){
		// 3. JDBC CONNECTIONS
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
		// 4. STATEMENT FROM CONNECTION
		// 5. GET RESULT SET FROM STATEMENT
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 6. CLOSE ALL THE CONNECTIONS

	}

}
