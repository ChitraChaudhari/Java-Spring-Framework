package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers){
		//logic for bubble sort
		return numbers;
	}
}
