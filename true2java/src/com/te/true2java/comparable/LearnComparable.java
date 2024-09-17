package com.te.true2java.comparable;

import java.util.Arrays;

public class LearnComparable {

	public static void main(String[] args) {
		Employee[] employees = { new Employee2(1, "Aniket", "Suryawanshi", 45000f, 26),
				new Employee2(12, "s", "Suryawanshi", 15000f, 21), 
				new Employee2(14, "db", "Suryawanshi", 35000f, 66),
				new Employee2(17, "Ansbiket", "Suryawanshi", 735000f, 54),
				new Employee2(11, "Anizfvket", "Suryawanshi", 955000f, 26)

		};

		for (Employee e : employees) {

			System.out.println(e);
		}
		System.out.println("Sorting");
		Arrays.sort(employees);
		for (Employee e : employees) {

			System.out.println(e);
		}

	}

}
