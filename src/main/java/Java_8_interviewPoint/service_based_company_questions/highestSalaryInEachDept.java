package Java_8_interviewPoint.service_based_company_questions;

import Java_8_interviewPoint.Employee;
import Java_8_interviewPoint.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
    Find the highest-paid employee in each department.
 */
public class highestSalaryInEachDept {
    public static void main(String[] args) {
        List<Employee> list = EmployeeData.getEmployees();

        Map<String, Optional<Employee>> result = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        result.forEach((dept, emp) ->
                System.out.println(dept + " -> " + emp.map(Employee::getName).orElse("NA")));
    }
}
