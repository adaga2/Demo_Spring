package com.Spring.demo.Example.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgoritm {
	
  public int[] sort(int[] number) {
		return number;
	}

}
