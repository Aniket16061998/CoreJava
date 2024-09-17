package com.te.true2java.map;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

import com.te.true2java.collections.set.Employee;

public class LearnTreeMap {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new TreeMap<Integer, Employee>();
		map.put(1, new Employee(1, "Aniket", "Suryawanshi", LocalDate.of(2017, 7, 21), 5000000f, 26));
		map.put(33, new Employee(5, "Suyash", "Suryawanshi", LocalDate.of(2012, 6, 3), 4000f, 22));
		map.put(54, new Employee(3, "Rushi", "Suryawanshi", LocalDate.of(2014, 5, 1), 8000f, 21));
		map.put(24, new Employee(2, "Rudra", "Suryawanshi", LocalDate.of(2015, 4, 16), 980000f, 27));
		map.put(5, new Employee(1, "Mohini", "Suryawanshi", LocalDate.of(2018, 2, 13), 210000f, 21));
		map.forEach((k,v)->System.out.println(k+"  "+v));
	}

}
