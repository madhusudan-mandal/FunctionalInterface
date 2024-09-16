package com.functionalInterface.example.WithStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 *  Using the Stream API, write a program that takes a list of integers, filters out the odd numbers, 
 *  squares the even numbers, and collects the result in a new list using Function<Integer, Integer>
 *
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		
		List<Integer> input1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> output = input1.stream().filter(a-> a%2==0).map(a->a*a).collect(Collectors.toList());
		
		for(Integer i: output)
			System.out.println(i);
	}

}
