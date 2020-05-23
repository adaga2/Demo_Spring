package com.Spring.demo.Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Spring.demo.Example.basic.BinarySearchImpl;

@SpringBootApplication
public class DemoSpringBasicApplication {

	public static void main(String[] args) {
		
		/*
		 * BinarySearchImpl binserch = new BinarySearchImpl(new BubbleSortAlgorithm());
		 */
		ApplicationContext applicationCon=SpringApplication.run(DemoSpringBasicApplication.class, args);
		BinarySearchImpl binserch	=applicationCon.getBean(BinarySearchImpl.class);
		System.out.println(binserch.binarySearch(new int[] {12,4,6},3));
	}

}
