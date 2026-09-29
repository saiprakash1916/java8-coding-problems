package Java_8_interviewPoint.service_based_company_questions;

import java.util.List;

/*
    Given an employee list, find the third-highest salary without sorting the complete list.
 */

public class third_highestSalaryWithoutSorting {
    public static void main(String[] args) {
        List<Employee> employeesList = EmployeeData.getEmployees();

        Integer result = thirdHighestSalary(employeesList);

        if (result == null) {
            System.out.println("Third highest salary does not exist");
        } else {
            System.out.println("Third highest salary: " + result);
        }
    }

    static Integer thirdHighestSalary(List<Employee> employees) {
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (Employee employee : employees) {
            int salary = employee.getSalary();

            if ((first != null && salary == first) || (second != null && salary == second) || (third != null && salary == third)) {
                continue;
            }

            if (first == null || salary > first) {
                third = second;
                second = first;
                first = salary;
            } else if (second == null || salary > second) {
                third = second;
                second = salary;
            } else if (third == null || salary > third) {
                third = salary;
            }
        }
        return third;
    }
}
