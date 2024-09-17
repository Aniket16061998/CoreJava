package com.te.true2java.stream.predicaate;

import java.util.function.Predicate;

public class TestBoys {

	public static void main(String[] args) {

		Boys b1 = new Boys(21, "Rushi");
		Boys b2 = new Boys(18, "Aniket");
		
		Predicate<Boys> predicateOnAge = b-> b.getAge()>=21;
		
		if(predicateOnAge.test(b2)) {
			System.out.println("Allowed");
		}else {
			System.out.println("Go to school first");
		}

	}

}
