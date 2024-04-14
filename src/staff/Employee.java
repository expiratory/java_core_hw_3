package staff;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    protected double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public int compareDates(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate1 = LocalDate.parse(date1, formatter);
        LocalDate localDate2 = LocalDate.parse(date2, formatter);
        return localDate1.compareTo(localDate2);
    }
}
