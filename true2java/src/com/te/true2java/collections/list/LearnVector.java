package com.te.true2java.collections.list;

import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

public class LearnVector {

	public static void main(String[] args) {
		List<Integer> vector = new Vector<>();
		vector.add(21);
		vector.add(22);
		vector.add(23);
		vector.add(24);
		vector.add(25);
		vector.add(26);
		vector.add(27);
		vector.add(28);
		vector.add(29);
		vector.add(30);

		// 1. for loop
		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}

		// 2. for each loop

		System.out.println();
		for (Integer integer : vector) {
			System.out.print(integer + " ");
		}

		// 3.1 for each method using anonyms inner class

		System.out.println();
		Consumer<Integer> consumer = new Consumer<Integer>() {


			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
				
			}

			

		};
		vector.forEach(consumer);
		
		// 3.2 for each method using lambda expresson
		
		System.out.println();
		vector.forEach(System.out::print);
		
//		4 Stream API
		System.out.println();
		vector.stream().forEach(System.out::print);
		
		
		

	}

}
