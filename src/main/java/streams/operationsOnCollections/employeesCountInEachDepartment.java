package streams.operationsOnCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class employeesCountInEachDepartment {
    private String name;
    private String department;

    public employeesCountInEachDepartment(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        List<employeesCountInEachDepartment> employees = Arrays.asList(
                new employeesCountInEachDepartment("Ravi", "HR"),
                new employeesCountInEachDepartment("Manoj", "IT"),
                new employeesCountInEachDepartment("Raja", "Finance"),
                new employeesCountInEachDepartment("Sai", "HR"),
                new employeesCountInEachDepartment("Tulsidas", "Finance"),
                new employeesCountInEachDepartment("Anil", "IT"),
                new employeesCountInEachDepartment("Ramu", "Finance"),
                new employeesCountInEachDepartment("Teja", "HR"),
                new employeesCountInEachDepartment("Akhil", "IT")
        );

        Map<String, Long> count = employees.stream()
                .collect(Collectors.groupingBy(
                        employeesCountInEachDepartment::getDepartment, Collectors.counting()
                ));

        System.out.println(count);
    }
}
