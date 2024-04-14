import staff.Employee;
import staff.Lead;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(45000);

        String date1 = "2020-01-01";
        String date2 = "2022-02-02";

        int result = employee.compareDates(date1, date2);

        if (result < 0) System.out.println(date1 + " is before " + date2);
        else if (result > 0) System.out.println(date1 + " is after " + date2);
        else System.out.println(date1 + " is equal to " + date2);

        Employee[] staff = new Employee[4];
        staff[0] = new Employee(30000);
        staff[1] = new Employee(40000);
        staff[2] = employee;
        staff[3] = new Lead(100000);

        Lead.increaseSalaries(staff, 5000);

        // Выводим зарплаты для проверки
        for (Employee emp : staff) {
            System.out.println(emp.getSalary());
        }
    }
}
