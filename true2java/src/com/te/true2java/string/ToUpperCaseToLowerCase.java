package com.te.true2java.string;

import java.util.Arrays;

public class ToUpperCaseToLowerCase {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = new String(s2);
		s1.toUpperCase();
		s2.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		int[] a = { 1, 2, 3, 4, 5, 5 };
		System.out.println(Arrays.toString(a));

	}

}
