package com.te.true2java.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

public class LearnLinkedHashSet {

	public static void main(String[] args) {

		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(5);
		linkedHashSet.add(76);
		linkedHashSet.add(32);
		linkedHashSet.add(12);
		linkedHashSet.add(87);
		linkedHashSet.add(53);
		linkedHashSet.add(23);
		linkedHashSet.add(55);
		linkedHashSet.add(9);
		linkedHashSet.add(85);
		linkedHashSet.add(74);
		linkedHashSet.add(43);
		linkedHashSet.add(35);
		linkedHashSet.add(95);
		Consumer<Integer> consumer = t -> System.out.print(t + " ");
		linkedHashSet.forEach(consumer);
	}

}
