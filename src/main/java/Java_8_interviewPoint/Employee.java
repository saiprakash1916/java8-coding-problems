package Java_8_interviewPoint;

public class Employee {
    private final int id;
    private final String name;
    private final int salary;
    private final String department;
    private final String location;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getLocation() {
        return location;
    }

    public Employee(int id, String name, int salary, String department, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee: [" + "id: " + id + ", name: " + name + ", salary: " + salary + ", department: " + department + ", location: " + location + ']';
    }
}
