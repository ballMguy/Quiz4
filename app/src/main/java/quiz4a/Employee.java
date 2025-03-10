package quiz4a;


// (1.1) เขียน Java Docs
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // (1.2)
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    // (1.3)
    public double calculateSalary() {
        return salary;
    }

    // (1.4)
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5)
    public String getName() {
        return name;
    }
}