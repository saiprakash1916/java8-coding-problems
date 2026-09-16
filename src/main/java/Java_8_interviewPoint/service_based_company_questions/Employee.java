package Java_8_interviewPoint.service_based_company_questions;

public class Employee {
    private final int id;
    private final String name;
    private final int salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: {" +  "id: " + id + ", name: " + name +  ", salary: " + salary + '}';
    }
}
