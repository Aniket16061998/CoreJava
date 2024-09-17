package com.te.true2java.oops.encapsulation;

import java.time.LocalDate;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(123);
		employee.setFirstname("Aniket");
		employee.setLastname("Suryawanshi");
		employee.setDateOfJoining(LocalDate.now());
		employee.setSalary(500000.0f);
	}

}
