package com.functionalInterface.example.FunctionChaining;

import java.util.function.Function;

/*
 * Use the Function interface to define two functions:
 * Function<Integer, Integer> multiplyByTwo
 * Function<Integer, Integer> square
 * Chain these functions such that for an input number, it first multiplies by 2 and then squares the result.
 */

public class FunctionChainingExample {

	
	public static void main(String[] args) {
		Integer input = 3;
		
		Function<Integer,Integer> multiplyByTwo = (in)-> in*2;
		
		Function<Integer, Integer> square = multiplyByTwo.andThen(in -> in*in);
		
		Integer result = square.apply(input);
		System.out.println(result);
	}
	
	
}
