package com.te.true2java.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LearnLinkedList {

	public static void main(String[] args) {
		List<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(5);
		linkedlist.add(6);
		linkedlist.add(7);
		linkedlist.add(8);
		linkedlist.add(9);
		linkedlist.add(10);
		linkedlist.add(11);

		// 1 For loop

		for (int i = 0; i < linkedlist.size(); i++) {
			System.out.print(linkedlist.get(i) + " ");
		}

		// 2 foreach loop
		System.out.println();
		for (Integer integer : linkedlist) {
			System.out.print(integer + " ");
		}

		// 3.1 for each method using anonyms inner class
		System.out.println();
		Consumer<Integer> consumer;

		consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");

			}

		};
		linkedlist.forEach(consumer);

		// 3.2 for each method using Lambda expression
		System.out.println();
		consumer = t -> System.out.print(t + " ");

		linkedlist.forEach(consumer);

		// 3.3 for each method using Lambda expression and method inner class
		System.out.println();
		consumer = System.out::print;

		linkedlist.forEach(consumer);

		// 4 Using Stream API foreach method

		System.out.println();
		consumer = t -> System.out.print(t + " ");
		linkedlist.stream().forEach(consumer);

		// 5 Itrator
		System.out.println();
		Iterator<Integer> iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		// 6 Listiterator

//		System.out.println();
//		ListIterator<Integer> listiterator = linkedlist.listIterator();
//		while (listiterator.hasNext()) {
//			System.out.print(listiterator.next() + " ");
//		}
//		System.out.println();
//		while (listiterator.hasPrevious()) {
//			System.out.print(listiterator.previous() + " ");
//		}

		// If i try to print in reverse it will not print anything as curser is at the
		// first

		System.out.println();
		ListIterator<Integer> listiterator = linkedlist.listIterator();
		while (listiterator.hasPrevious()) {
			System.out.print(listiterator.previous() + " ");           ///this line will go blank
		}
		System.out.println();
		while (listiterator.hasNext()) {
			System.out.print(listiterator.next() + " ");
		}

	}

}
