package com.te.true2java.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pipeline {

	static class Employee {
		private Integer id;
		private String name;
		private Integer age;
		private Float salary;
		private Integer experiance;

		Employee() {
		}

		public Employee(Integer id, String name, Integer age, Float salary, Integer experiance) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.experiance = experiance;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Float getSalary() {
			return salary;
		}

		public void setSalary(Float salary) {
			this.salary = salary;
		}

		public Integer getExperiance() {
			return experiance;
		}

		public void setExperiance(Integer experiance) {
			this.experiance = experiance;
		}

		@Override
		public int hashCode() {
			return Objects.hash(age, experiance, id, name, salary);
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
			return Objects.equals(age, other.age) && Objects.equals(experiance, other.experiance)
					&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
					&& Objects.equals(salary, other.salary);
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", experiance="
					+ experiance + "]";
		}

		

	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Pipeline.Employee>();
		employees.add(new Employee(1, "Aniket", 25, 500000f, 3));
		employees.add(new Employee(2, "Preeti", 21, 400000f, 6));
		employees.add(new Employee(3, "Gauri", 21, 500000f, 7));
		employees.add(new Employee(4, "mohini", 23, 700000f, 3));
		employees.add(new Employee(5, "Suyash", 15, 900000f, 6));
		
		System.out.println("Before");
		employees.forEach(System.out::println);
		employees.stream().forEach(e->{
			if(e.getExperiance()>=5) {
				e.setSalary(e.getSalary()*1.25f);
			}
		});
		System.out.println("After");
		employees.forEach(System.out::println);

	}

}
