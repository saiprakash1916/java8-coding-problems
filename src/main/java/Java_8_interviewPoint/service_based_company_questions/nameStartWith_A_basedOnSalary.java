package Java_8_interviewPoint.service_based_company_questions;

import java.util.List;
import java.util.stream.Collectors;

/*
    Find employees whose names start with `"A"` and salary is greater than ₹50,000.
 */
public class nameStartWith_A_basedOnSalary {
    public static void main(String[] args) {
        List<Employee> list = EmployeeData.getEmployees();

        List<Employee> result = list.stream()
                .filter(name -> name.getName().startsWith("A"))
                .filter(salary -> salary.getSalary() > 50000)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
