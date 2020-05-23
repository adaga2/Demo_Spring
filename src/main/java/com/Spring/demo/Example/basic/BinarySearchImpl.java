package com.Spring.demo.Example.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgoritm sortAlgorithm;
	
	

	/*
	 * public BinarySearchImpl(SortAlgoritm sortAlgoritm) { super();
	 * this.sortAlgoritm = sortAlgoritm; }
	 */
	public int binarySearch(int number[],int numToSearch) {
		
		//BubbleSortAlgorithm sort = new BubbleSortAlgorithm();
		int sorted[]=sortAlgorithm.sort(number);
		
		System.out.println(sortAlgorithm);
		return 0;
		
	}

@PostConstruct
	public void postConst(){
		logger.info("post const");
	}

@PreDestroy
public void dest() {
	logger.info("pre Dist");
}
}


