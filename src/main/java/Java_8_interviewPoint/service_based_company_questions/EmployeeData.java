package Java_8_interviewPoint.service_based_company_questions;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(101, "Alice", 85000, "IT", "Hyderabad"),
                new Employee(102, "Bob", 72000, "HR", "Bangalore"),
                new Employee(103, "Charlie", 95000, "IT", "Pune"),
                new Employee(104, "Diana", 65000, "Finance", "Mumbai"),
                new Employee(105, "Ethan", 120000, "IT", "Hyderabad"),
                new Employee(106, "Fiona", 55000, "HR", "Chennai"),
                new Employee(107, "George", 88000, "Finance", "Bangalore"),
                new Employee(108, "Hannah", 105000, "IT", "Delhi"),
                new Employee(109, "Ian", 76000, "Sales", "Mumbai"),
                new Employee(110, "Julia", 92000, "Sales", "Hyderabad"),
                new Employee(111, "Kevin", 68000, "HR", "Pune"),
                new Employee(112, "Laura", 115000, "Finance", "Chennai"),
                new Employee(113, "Michael", 81000, "IT", "Bangalore"),
                new Employee(114, "Nina", 99000, "Sales", "Delhi"),
                new Employee(115, "Oscar", 60000, "Finance", "Mumbai"),
                new Employee(116, "Priya", 125000, "IT", "Hyderabad"),
                new Employee(117, "Quinn", 73000, "Sales", "Pune"),
                new Employee(118, "Rachel", 87000, "HR", "Bangalore"),
                new Employee(119, "Steve", 91000, "Finance", "Delhi"),
                new Employee(120, "Tina", 78000, "Sales", "Chennai"),
                new Employee(103, "Charlie", 95000, "IT", "Pune"),
                new Employee(110, "Julia", 92000, "Sales", "Hyderabad")
        );
    }
}
