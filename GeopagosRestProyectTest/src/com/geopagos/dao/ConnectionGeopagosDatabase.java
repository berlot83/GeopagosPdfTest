package com.geopagos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/***
 * 
 * @author user A A Berlot
 * 29/03/2018
 *
 */

public class ConnectionGeopagosDatabase {

	private Connection connection;
	
	public ConnectionGeopagosDatabase() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:mysql://localhost/geopagos", "root", "");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public Connection connectNow() {
		return connection;
	}
	
	public void closeConnection() throws SQLException {
		try{
			connection.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
}
