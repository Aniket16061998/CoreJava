package com.te.interviewpreparation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Overriding toString() to print Employee details
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }
}

public class EmployeeSortByName {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 55000));
        employees.add(new Employee("Charlie", 103, 60000));
        employees.add(new Employee("David", 104, 45000));

        // Sort employees by name using Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        // Print the sorted employee list
        System.out.println("Sorted Employees by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
