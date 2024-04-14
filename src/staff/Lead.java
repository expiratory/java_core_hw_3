package staff;

public class Lead extends Employee {
    public Lead(double salary) {
        super(salary);
    }

    public static void increaseSalaries(Employee[] employees, double increment) {
        for (Employee emp : employees) {
            if (!(emp instanceof Lead)) emp.salary += increment;
        }
    }
}
