package Java_8_interviewPoint.service_based_company_questions;

import Java_8_interviewPoint.Employee;
import Java_8_interviewPoint.EmployeeData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Group employees based on department and calculate their average salary.
 */
public class employeeBasedOnDept_AvgSalary {
    public static void main(String[] args) {
        List<Employee> list = EmployeeData.getEmployees();

        Map<String, Double> result = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingInt(Employee::getSalary)
                ));

        System.out.println(result);
    }
}
