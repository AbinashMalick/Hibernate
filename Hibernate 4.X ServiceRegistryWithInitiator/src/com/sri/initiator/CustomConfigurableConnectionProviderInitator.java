package com.sri.initiator;

import java.util.Map;

import org.hibernate.boot.registry.StandardServiceInitiator;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.spi.ServiceRegistryImplementor;

public class CustomConfigurableConnectionProviderInitator implements StandardServiceInitiator<ConnectionProvider> {

	@Override
	public Class<ConnectionProvider> getServiceInitiated() {
		return null;
	}

	@Override
	public ConnectionProvider initiateService(Map arg0, ServiceRegistryImplementor arg1) {
		return null;
	}
}
