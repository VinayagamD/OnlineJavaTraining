/**
 * 
 */
package com.javatraining.advancejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author vinay
 *
 */
public class JDBCBatchTranscationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Create Connection String
		String url = "jdbc:mysql://localhost:3306/students";
		// 2. ADD USER CREDENTIALS 
		String username = "root";
		String password = "drago";
		String sql = "INSERT INTO students(roll_no, name, phone_no) VALUES (1237, 'test27', 'testphone');";
		String sql2 = "INSERT INTO students(roll_no, name, phone_no) VALUES (1238, 'test28', 'testphone');";
		try(Connection con = DriverManager.getConnection(url, username, password);
			Statement statement = con.createStatement();){
		// 3. JDBC CONNECTIONS
			con.setAutoCommit(false);
			int rows = statement.executeUpdate(sql);
		// 4. STATEMENT FROM CONNECTION
		// 5. GET RESULT SET FROM STATEMENT
			System.out.println(" ===> " +rows);
			Savepoint savepoint = con.setSavepoint("Insert1");
			rows = statement.executeUpdate(sql2);
			System.out.println(" ===> " +rows);
			con.rollback(savepoint);
			con.commit();
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 6. CLOSE ALL THE CONNECTIONS

	}

}
