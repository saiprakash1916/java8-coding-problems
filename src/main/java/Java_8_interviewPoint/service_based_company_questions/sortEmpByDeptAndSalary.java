package Java_8_interviewPoint.service_based_company_questions;

import Java_8_interviewPoint.Employee;
import Java_8_interviewPoint.EmployeeData;

import java.util.Comparator;
import java.util.List;

/*
    Sort employees first by department and then by salary.
 */
public class sortEmpByDeptAndSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeData.getEmployees();

        List<Employee> result = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getSalary))
                .toList();

        result.forEach(e ->
                System.out.println(e.getDepartment() + " | " + e.getName() + " | " + e.getSalary()));
    }
}
