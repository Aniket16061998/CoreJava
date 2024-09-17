package com.te.true2java.stream.supplier;

import java.util.function.Supplier;

public class LearnSupplier {
	static class Employee {
		String name;

		Employee(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}

	public static void main(String[] args) {

//		Employee e1 = new Employee("Aniket");
		Supplier<Employee> s1 = () -> new Employee("Preeti");
		
		Employee employee = s1.get();
		System.out.println(employee.getName());
		
		

	}

}
