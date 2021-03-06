package in.code4j.learn.corejava.chapter4_4;

/**
 * @author chenlihua
 * @date 2016/2/22
 * @time 15:26
 */
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);

        System.out.println("\nTesting triple Salary:");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        /*
         * Test3:Methods can't attach new objects to object parameters
         */
        System.out.println("\nTesting swap");
        Employee a = new Employee("Alice", 7000);
        Employee b = new Employee("Bob", 3000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    private static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("Before: x=" + x.getName());
        System.out.println("Before: y=" + y.getName());
    }

    private static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    private static void tripleValue(double x) {
        x = x * 3;
        System.out.println("End of method x = " + x);
    }
}
