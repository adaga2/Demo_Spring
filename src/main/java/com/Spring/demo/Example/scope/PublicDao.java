package com.Spring.demo.Example.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
//@Scope("prototype")
/* @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) */

public class PublicDao {
	@Autowired
JdbcClass jdbc;

	public JdbcClass getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcClass jdbc) {
		this.jdbc = jdbc;
	}
	
}
