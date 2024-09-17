package com.te.true2java.stream.function;

import java.util.function.Function;

public class LearnFunction {
	static class Trainee {
		String name;

		Trainee(String name) {
			this.name = name;
		}
	}

	static class Employee {
		String name;

		Employee(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {
		Trainee trainee = new Trainee("Aniket");
		System.out.println("Trainee name:" + trainee.name);

		Function<Trainee, Employee> function = t -> new Employee("Mr " + t.name);
		Employee e1 = function.apply(trainee);
		System.out.println("Employee name: "+e1.name);
	}

}
