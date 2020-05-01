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
public class JDBCPrparedStatementExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. Create Connection String
		String url = "jdbc:mysql://localhost:3306/students";
		// 2. ADD USER CREDENTIALS 
		String username = "root";
		String password = "drago";
		String sql = "SELECT * FROM students;";
		try(Connection con = DriverManager.getConnection(url, username, password);
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);){
		// 3. JDBC CONNECTIONS
			
		// 4. STATEMENT FROM CONNECTION
		// 5. GET RESULT SET FROM STATEMENT
			int counter = 0;
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String phoneNo = resultSet.getString("phone_no");
				Timestamp timeStamp = resultSet.getTimestamp("created_at");
				LocalDateTime createdAt = null;
				LocalDateTime updatedAt = null;
				if(timeStamp != null) {
					createdAt = timeStamp.toLocalDateTime();
				}
				timeStamp = resultSet.getTimestamp("updated_at");
				if(timeStamp != null) 
				updatedAt = timeStamp.toLocalDateTime();
				System.out.println(counter++ + " Id ==> " + id+ ", name ==> "+ name+" , Phone No ==> " +phoneNo + 
						" , Created At ==> " + createdAt + " , Updated At ==> "+ updatedAt);
				
			}
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 6. CLOSE ALL THE CONNECTIONS

	}

}
