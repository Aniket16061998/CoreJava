package com.te.true2java.stream.consumer;

import java.util.function.Consumer;

public class LearnConsumer {

	public static void main(String[] args) {
		Consumer<Integer> a1= (a)->System.out.println(a);
		a1.accept(16);
	}

}
