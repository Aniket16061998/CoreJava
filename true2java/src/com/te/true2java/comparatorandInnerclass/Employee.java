package com.te.true2java.comparatorandInnerclass;

import java.util.Objects;

public class Employee {
	private Integer id;
	// Integer consumes more memory than int
	// so it should be used when cannot be avoided
	private String firstname;
	private String lastname;

	private Float salary;
	private Integer age;

	public Employee() {
		super();
	}

	public Employee(Integer id, String firstname, String lastname, Float salary, Integer age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1);
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		if (age < 18) {
			this.age = age;
		} else {
			throw new RuntimeException();
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(age, firstname, id, lastname, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(age, other.age) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(id, other.id) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ ", age=" + age + "]";
	}

}
