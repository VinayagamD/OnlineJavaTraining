/**
 * 
 */
package com.javatraining.advancejava.jdbc;

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
public class JDBCCallableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Create Connection String
		String url = "jdbc:mysql://localhost:3306/students";
		// 2. ADD USER CREDENTIALS 
		String username = "root";
		String password = "drago";
		String sql = "INSERT INTO students(roll_no, name, phone_no) VALUES (1234, 'test1', 'testphone');";
		try(Connection con = DriverManager.getConnection(url, username, password);
			Statement statement = con.createStatement();){
		// 3. JDBC CONNECTIONS
			int rows = statement.executeUpdate(sql);
		// 4. STATEMENT FROM CONNECTION
		// 5. GET RESULT SET FROM STATEMENT
			System.out.println(" ===> " +rows);
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 6. CLOSE ALL THE CONNECTIONS

	}

}
