package com.te.true2java.collections.set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {

	public static void main(String[] args) {
		Set<Integer> integers = new HashSet<Integer>();
		integers.add(4);
		integers.add(8);
		integers.add(7);
		integers.add(8);
		integers.add(9);
		integers.add(4);
		integers.add(3);
		integers.add(1);
		integers.add(2);
		integers.add(44);
		integers.add(76);
		
		//Stream API
		
		integers.forEach(System.out::print);
		
		 
		
	}

}
