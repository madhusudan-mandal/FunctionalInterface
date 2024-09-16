package com.functionalInterface.example.BiultInFI;

/*
 *  Java provides several built-in functional interfaces like Predicate,
 *  Function, Supplier, etc. 
 *  Use a Predicate<Integer> to filter even numbers from a list of integers and print them.
 */

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class FilterEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(9);
		list.add(11);
		list.add(24);
		list.add(7);
		list.add(16);
		
		Predicate<Integer> predicate = (input)-> input%2==0;
		
		for(int i=0;i<list.size();i++)
		{
			if(predicate.test(list.get(i)))
			{
				System.out.println(list.get(i));
			}
		}
		
		
	}

}
