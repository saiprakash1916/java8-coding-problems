package Java_8_interviewPoint.service_based_company_questions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
    Find duplicate employees based on employee ID.
 */
public class duplicateEmployeesBasedOnID {
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

        // Printing only Employee Id's
        Set<Integer> duplicateIds = employeesList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getId,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(duplicateIds);

        // Printing Employee Id's with Employee names
        Map<Integer, Long> countMap = employeesList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getId,
                        Collectors.counting()
                ));

        employeesList.stream()
                .filter(emp -> countMap.get(emp.getId()) > 1)
                .forEach(System.out::println);
    }
}
