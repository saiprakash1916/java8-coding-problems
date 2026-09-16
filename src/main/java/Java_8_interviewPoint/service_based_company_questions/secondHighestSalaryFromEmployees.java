package Java_8_interviewPoint.service_based_company_questions;

import java.util.Comparator;
import java.util.List;

/*
    Given an employee list, find the second-highest salary using Java 8.
 */
public class secondHighestSalaryFromEmployees {
    public static void main(String[] args) {
        List<Employee> employeesList = List.of(
                new Employee(101, "John", 50000),
                new Employee(102, "David", 80000),
                new Employee(103, "Robert", 30000),
                new Employee(101, "Alex", 100000),
                new Employee(104, "Mike", 70000),
                new Employee(102, "Sam", 80000),
                new Employee(105, "Tom", 60000)
        );

        Integer result = employeesList.stream().
                map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
