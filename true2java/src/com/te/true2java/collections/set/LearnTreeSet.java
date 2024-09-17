package com.te.true2java.collections.set;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {

	public static void main(String[] args) {
//		Comparator<Employee> comparator = (e1, e2) -> e1.getAge() - e2.getAge();
		// OR

		Comparator<Employee> reverseOrder = Comparator.reverseOrder();
		Comparator<Employee> naturalOrder = Comparator.naturalOrder();
		Comparator<Employee> reverseOrder1 = Collections.reverseOrder();
//		Set<Employee> employees = new TreeSet<Employee>((e1, e2) -> e1.getAge() - e2.getAge());
		Set<Employee> employees = new TreeSet<Employee>(reverseOrder1);

		employees.add(new Employee(1, "Aniket", "Suryawanshi", LocalDate.of(2017, 7, 11), 5000000f, 26));
		employees.add(new Employee(2, "Suyash", "Suryawanshi", LocalDate.of(2020, 2, 11), 5000000f, 21));
		employees.add(new Employee(3, "Monika", "Suryawanshi", LocalDate.of(2017, 5, 5), 5000000f, 22));
		employees.add(new Employee(4, "Rushikessh", "Suryawanshi", LocalDate.of(2020, 1, 21), 5000000f, 23));
		employees.add(new Employee(5, "Shubham", "Pawar", LocalDate.of(2019, 9, 19), 5000000f, 26));

		employees.forEach(System.out::println);

	}

}
