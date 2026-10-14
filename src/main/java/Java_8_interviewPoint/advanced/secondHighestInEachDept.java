package Java_8_interviewPoint.advanced;

import Java_8_interviewPoint.Employee;
import Java_8_interviewPoint.EmployeeData;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
    Given an employee list, find the second-highest salary in each department.
 */
public class secondHighestInEachDept {
    public static void main(String[] args) {
        List<Employee> list = EmployeeData.getEmployees();

        Map<String, Optional<Integer>> result = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.mapping(Employee::getSalary,
                                        Collectors.toCollection(TreeSet::new)
                                ),
                                salaries -> salaries.size() < 2
                                        ? Optional.empty() : Optional.of(salaries.lower(salaries.last()))
                        )
                ));

        result.forEach((dept, salary)
                -> System.out.println(dept + " : " + salary.orElse(null)));
    }
}
