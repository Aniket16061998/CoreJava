package com.te.true2java.polymorphism;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UpcastingDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		list.add(5);
		list.add(6);
		list.add(7);
		list.add(1);
		list.add(1);
		LinkedList<Integer> integers = (LinkedList) list;

		System.out.println(list);
		int[] a = { 1, 2, 3, 5, 6, 6, 7 };
		

	}

}
