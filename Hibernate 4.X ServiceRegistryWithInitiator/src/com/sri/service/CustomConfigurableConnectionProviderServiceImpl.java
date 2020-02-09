package com.sri.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.exception.spi.Configurable;
import org.hibernate.service.spi.Startable;
import org.hibernate.service.spi.Stoppable;
/*
 * This service is used for pluging in aditional functionality into hibernate.
 * There are several service roles, and this class is an implementation of a service role ConnectionProvider 
 * */

public class CustomConfigurableConnectionProviderServiceImpl implements ConnectionProvider, Startable, Stoppable, Configurable{

	Connection con = null;
	
	static {
		try {
			Class.forName("oracle.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean isUnwrappableAs(Class arg0) {
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		return null;
	}

	@Override
	public void configure(Properties props) throws HibernateException {
				
	}

	@Override
	public void stop() {
	}

	@Override
	public void start() {
		
	}

	@Override
	public void closeConnection(Connection con) throws SQLException {
		if (con.isClosed()==false) {
			con.close();
			System.out.println("closeConnection()");
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","automobile","maruti");
		return con;
	}

	@Override
	public boolean supportsAggressiveRelease() {
		return true;
	}
}
