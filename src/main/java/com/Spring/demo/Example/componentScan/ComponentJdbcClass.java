package com.Spring.demo.Example.componentScan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcClass {

	public ComponentJdbcClass() {
		super();
		System.out.println("Jdbc Connetion");
	}

}
