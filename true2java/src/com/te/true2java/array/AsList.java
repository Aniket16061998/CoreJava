package com.te.true2java.array;

import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {

		int[] a = { 3, 2, 1, 4, 6, 7, 0 };
//		List ab = Arrays.asList(a);              // It is treating int[]a as one element
		List<Integer> ab1 = Arrays.asList(1, 2, 3, 4, 5, 6, 2); // It is creating immutable list
//		ab1.add(10);                             // UnsupportedOperationException
//		List<Integer> b = new ArrayList<>(Arrays.asList(3, 2, 1, 4, 6, 7, 0)); /// It is creating mutable arraylist

//		System.out.println(a.length);
//		System.out.println(b.size());
//		ab1.add(10);

		ab1.stream().filter(e->e%2==0).forEach(System.out::println);
		System.out.println(ab1);

	}

}
