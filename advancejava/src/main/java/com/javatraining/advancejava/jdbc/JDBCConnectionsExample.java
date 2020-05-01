/**
 * 
 */
package com.javatraining.advancejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author vinay
 *
 */
public class JDBCConnectionsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Create Connection String
		String url = "jdbc:mysql://localhost:3306/test";
		// 2. ADD USER CREDENTIALS 
		String username = "root";
		String password = "drago";
		String sql = "SELECT * FROM users WHERE username=? AND password=?;";
		
		try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = con.prepareStatement(sql);
			){
		// 3. JDBC CONNECTIONS
			statement.setString(1, "test");
			statement.setString(2, "test12");
		// 4. STATEMENT FROM CONNECTION
			ResultSet rs = statement.executeQuery();
		// 5. GET RESULT SET FROM STATEMENT
			System.out.println(rs.next());
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 6. CLOSE ALL THE CONNECTIONS

	}

}
