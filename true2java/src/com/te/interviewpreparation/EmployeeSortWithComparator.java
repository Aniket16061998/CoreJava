package com.te.interviewpreparation;
import java.util.ArrayList;
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

public class EmployeeSortWithComparator {

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Charlie", 103, 60000));
        employees.add(new Employee("David", 104, 45000));
        employees.add(new Employee("Bob", 102, 55000));

        // Sort employees by name using a custom Comparator with a manual sort implementation
        sortEmployeesByName(employees, new Comparator<Employee>() {
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

    // Custom sort method that uses a Comparator to sort the list
    public static void sortEmployeesByName(List<Employee> employees, Comparator<Employee> comparator) {
        int n = employees.size();
        // Implementing a simple Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare using the provided Comparator
                if (comparator.compare(employees.get(j), employees.get(j + 1)) > 0) {
                    // Swap employees[j] and employees[j+1] if they are in the wrong order
                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }
    }
}
