package com.Spring.demo.Example.componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@ComponentScan("package com.Spring.demo.Example.componentScan")
//@Scope("prototype")
/* @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) */

public class ComponentPublicDao {
	@Autowired
ComponentJdbcClass jdbc;

	public ComponentJdbcClass getJdbc() {
		return jdbc;
	}

	public void setJdbc(ComponentJdbcClass jdbc) {
		this.jdbc = jdbc;
	}

	
}
