package Java_8_interviewPoint.service_based_company_questions;

import java.util.Comparator;
import java.util.List;

/*
    Given an employee list, find the second-highest salary using Java 8.
 */
public class secondHighestSalaryFromEmployees {
    public static void main(String[] args) {
        List<Employee> employeesList = EmployeeData.getEmployees();

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
