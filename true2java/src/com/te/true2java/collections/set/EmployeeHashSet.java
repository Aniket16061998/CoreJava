package com.te.true2java.collections.set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();

		employees.add(new Employee(1, "Aniket", "Suryawanshi", LocalDate.of(2017, 7, 11), 5000000f, 26));
		employees.add(new Employee(2, "Suyash", "Suryawanshi", LocalDate.of(2020, 2, 11), 5000000f, 26));
		employees.add(new Employee(3, "Monika", "Suryawanshi", LocalDate.of(2017, 5, 5), 5000000f, 26));
		employees.add(new Employee(4, "Rushikessh", "Suryawanshi", LocalDate.of(2020, 1, 21), 5000000f, 26));
		employees.add(new Employee(5, "Shubham", "Pawar", LocalDate.of(2019, 9, 19), 5000000f, 26));
		
		employees.forEach(System.out::print);
		

	}

}
