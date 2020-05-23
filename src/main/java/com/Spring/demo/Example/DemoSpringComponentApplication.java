package com.Spring.demo.Example;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.Spring.demo.Example.basic.BinarySearchImpl;
import com.Spring.demo.Example.componentScan.ComponentPublicDao;
import com.Spring.demo.Example.scope.PublicDao;

@SpringBootApplication
@ComponentScan("package com.Spring.demo.Example")
public class DemoSpringComponentApplication {
	
	private static Logger LOGGER =LoggerFactory.getLogger(DemoSpringComponentApplication.class);

	public static void main(String[] args) {
		
		
		ApplicationContext applicationCon=SpringApplication.run(DemoSpringComponentApplication.class, args);
		ComponentPublicDao publicDao	=applicationCon.getBean(ComponentPublicDao.class);
		/*
		 * ComponentPublicDao
		 * publicDao1=applicationCon.getBean(ComponentPublicDao.class);
		 */
		
		LOGGER.info("{}",publicDao.getJdbc());
		
	
	}

}
