package com.Spring.demo.Example.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgoritm{
	
  public int[] sort(int[] number) {
		return number;
	}

}
