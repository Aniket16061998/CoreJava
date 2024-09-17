package com.te.true2java.stream.predicaate;

import java.util.function.Predicate;

import com.te.true2java.comparatorandInnerclass.Employee;

public class LearnPredicate {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Aniket", "Suryawanshi", 5000000f, 26);
		Predicate<Employee> predicate = e->e.getAge()>=18;
		if(predicate.test(e1)) {
			System.out.println("Employee with id "+e1.getId()+" has age more than or equals to 18");
		}else {
			System.out.println("Employee age is less than 18");
		}
	}

}
