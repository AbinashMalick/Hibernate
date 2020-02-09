package com.mds.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

public class CustomServiceMetadataSources implements ConnectionProvider{


	static {
		try {
			Connection con = null;
			con=DriverManager.getConnection("com.mysql.jdbc.Driver");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public boolean isUnwrappableAs(Class arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeConnection(Connection arg0) throws SQLException {
		if (con.isClosed()==false) {
			con.close();
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automobile","root","admin");
		con.setAutoCommit(false);
		return con;
	}

	@Override
	public boolean supportsAggressiveRelease() {
		return true;
	}
}
