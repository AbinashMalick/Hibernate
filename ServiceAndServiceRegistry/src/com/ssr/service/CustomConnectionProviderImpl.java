package com.ssr.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

public class CustomConnectionProviderImpl implements ConnectionProvider{

	@Override
	public boolean isUnwrappableAs(Class arg0) {
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		return null;
	}

	@Override
	public void closeConnection(Connection conn) throws SQLException {
		System.out.println("closeConnection()");
		if(conn.isClosed()==false) {
			conn.close();
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("getConnection()");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automobile","root","admin");
			con.setAutoCommit(false);
		}catch(Exception e) {
			throw new SQLException(e);
		}
		return con;
	}
	
	@Override
	public boolean supportsAggressiveRelease() {
		return true;
	}
}
