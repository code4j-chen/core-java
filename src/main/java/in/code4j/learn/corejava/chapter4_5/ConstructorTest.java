package in.code4j.learn.corejava.chapter4_5;

import java.util.Random;

/**
 * @author chenlihua
 * @date 2016/2/24
 * @time 10:11
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Harray", 40000);
        employees[1] = new Employee(60000);
        employees[2] = new Employee();
        for (Employee employee : employees) {
            System.out.println("name = " + employee.getName() + ", id = " + employee.getId() + ", salary = " + employee.getSalary());
        }
    }
}

class Employee {
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Employee #" + nextId, salary);
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    private static int nextId;
    private int id;
    private String name = "";
    private double salary;
    static {
        Random random = new Random();
        nextId = random.nextInt(10000);
    }
    {
        id = nextId;
        nextId++;
    }
}
