package com.Spring.demo.Example;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Spring.demo.Example.basic.BinarySearchImpl;
import com.Spring.demo.Example.scope.PublicDao;

@SpringBootApplication
public class DemoSpringScopeApplication {
	
	private static Logger LOGGER =LoggerFactory.getLogger(DemoSpringScopeApplication.class);

	public static void main(String[] args) {
		
		
		ApplicationContext applicationCon=SpringApplication.run(DemoSpringScopeApplication.class, args);
		PublicDao publicDao	=applicationCon.getBean(PublicDao.class);
		PublicDao publicDao1=applicationCon.getBean(PublicDao.class);
		
		LOGGER.info("{}",publicDao);
		LOGGER.info("{}",publicDao.getJdbc());
		
		LOGGER.info("{}",publicDao1);
		LOGGER.info("{}",publicDao1.getJdbc());
	
	}

}
