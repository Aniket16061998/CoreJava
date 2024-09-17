package com.te.true2java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LearnArrayList {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(11);
		integers.add(12);
		integers.add(13);
		integers.add(14);
		integers.add(15);
		integers.add(20);
		integers.add(16);
		integers.add(17);
		integers.add(18);
		integers.add(19);
		// 1
		for (int i = 0; i < integers.size(); i++) {
			System.out.print(integers.get(i) + " ");
		}

		// 2
		System.out.println();
		for (Integer integer : integers) {
			System.out.print(integer + " ");
		}
		// 3

		Consumer<Integer> consumer;
		System.out.println();
//		class MyConsumer implements Consumer<Integer> {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.print(t + " ");
//
//			}
//
//		}
//		consumer = new MyConsumer();
//		

		// OR

		// Anonymas inner class
//		System.out.println();
//		consumer = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.print(t + " ");
//
//			}
//
//		};
//		

		// OR

//		lambda expression

		consumer = t -> System.out.print(t + " ");

		integers.forEach(consumer);
		// in lambda expression we can use method reference
		System.out.println();
//		integers.forEachs(System.out::print);

		// 4

		// Stream API Foreach method
		System.out.println();
		integers.stream().forEach(consumer);

		//5  Itrator
		System.out.println();
		Iterator<Integer> iterator = integers.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		
		//6 Listiterator
		
		System.out.println();
		ListIterator<Integer> listiterator = integers.listIterator();
		while(listiterator.hasNext()) {
			System.out.print(listiterator.next()+" ");
		}
		System.out.println();
		while(listiterator.hasPrevious()) {
			System.out.print(listiterator.previous()+" ");
		}
		
	}
	

}
