package com.te.true2java.comparatorandInnerclass;

import java.util.Arrays;

public class LearnComparator1 {

	public static void main(String[] args) {
		Employee[] employees1 = {
				new Employee(1,"Aniket","LN",5000000f,26),
				new Employee(7,"Prreti","LN",10000f,26),
				new Employee(6,"Mohini","LN",400000f,26),
				new Employee(5,"Janvhi","LN",3400000f,26),
				new Employee(4,"Sanskriti","LN",20000f,26),
				new Employee(3,"Sayali","LN",200000f,26),
				new Employee(2,"Mansii","LN",40000f,26),
		};
		Arrays.stream(employees1).forEach(System.out::println);

	}

}
