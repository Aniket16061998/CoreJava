package com.te.true2java.comparatorandInnerclass;

import java.util.Arrays;
import java.util.Comparator;

import com.te.true2java.comparable.Employee;

//class ComparatorOnId implements Comparator<Employee> {
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//
//		return o1.getId().compareTo(o2.getId());
//	}                   //If i want to use this class inside the one partiular class only we can make that class as inner class
//
//}

class LearnComparator {

	static ComparatorOnId comparatorOnId() {
		return new ComparatorOnId();

	}

	// 1. Using Inner class
	private static class ComparatorOnId implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {

			return o1.getId().compareTo(o2.getId());
		}

	}

	// 2. Using Anonymous inner class
	private static Comparator<Employee> comparatorOnAge = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {

			return o1.getAge().compareTo(o2.getAge());
		}
	};

	// 3. Lambda expression

	private static Comparator<Employee> comparatorOnSalary = (o1, o2) -> o1.getSalary().compareTo(o2.getSalary());

	public static void main(String[] args) {

		class ComparatorOnIdAge implements Comparator<Employee> {

			@Override
			public int compare(Employee o1, Employee o2) {

				return o1.getId().compareTo(o2.getId());
			}

		}

		Employee[] employees = { new Employee(1, "Aniket", "Suryawanshi", 45000f, 26),
				new Employee(12, "s", "Suryawanshi", 15000f, 21), new Employee(14, "db", "Suryawanshi", 35000f, 66),
				new Employee(17, "Ansbiket", "Suryawanshi", 735000f, 54),
				new Employee(11, "Anizfvket", "Suryawanshi", 955000f, 26)

		};
		System.out.println("Original array");
		for (Employee e : employees) {

			System.out.println(e);
		}
		System.out.println("Sorting");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
//		ComparatorOnId learnComparator = LearnComparator.comparatorOnId();    //If method and inner class & inner class is static

		ComparatorOnId comparatorOnId1 = new LearnComparator().comparatorOnId(); // if method of inner class & inner
																					// class is non static

		String sortType = "AGEa";
		Comparator<Employee> comparator;
		if (sortType.equalsIgnoreCase("age")) {
			comparator = comparatorOnAge;
		} else if (sortType.equalsIgnoreCase("id")) {
			comparator = comparatorOnId1;
		} else {
			comparator = comparatorOnSalary;
		}
		Arrays.sort(employees, comparator);
		for (Employee e : employees) {

			System.out.println(e);
		}

	}

}
