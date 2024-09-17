package com.te.true2java.comparable;

import java.time.LocalDate;

public class Employee2 extends Employee implements Comparable<Employee2> {

	Employee2(Integer id, String firstname, String lastname, Float salary, Integer age) {
		super(id, firstname, lastname, salary, age);
	}

	@Override
	public int compareTo(Employee2 o) {
		
		return this.getAge().compareTo(o.getAge());
	}

//	@Override
//	public int compareTo(Employee2 o) {
//		
//		return this.getFirstname().compareTo(o.getFirstname());
//	}

//	@Override
//	public int compareTo(Employee2 e) {
//
//		return (this.getId() - e.getId());
//	}

}
