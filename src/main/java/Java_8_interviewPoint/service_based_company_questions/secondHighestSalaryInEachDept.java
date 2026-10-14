package Java_8_interviewPoint.service_based_company_questions;

import Java_8_interviewPoint.Employee;
import Java_8_interviewPoint.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
    Find the second-highest-paid employee in each department.
 */
public class secondHighestSalaryInEachDept {
    public static void main(String[] args) {
        List<Employee> employeeData = EmployeeData.getEmployees();

        Map<String, Optional<Employee>> result = employeeData.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getSalary))
                                        .skip(1)
                                        .findFirst()
                        )
                ));

        result.forEach((dept, emp)
                -> System.out.println(dept + " : " + emp.map(Employee::getName).orElse(null)));
    }
}
