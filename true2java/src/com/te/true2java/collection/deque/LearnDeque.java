package com.te.true2java.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class LearnDeque {

	public static void main(String[] args) {
		
		Deque<Integer> a = new ArrayDeque<Integer>();
		ArrayDeque<Integer> b = (ArrayDeque<Integer>) a;
 		a.add(10);
		a.addFirst(20);
		 Iterator<Integer> iterator = a.descendingIterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }

	}

}
