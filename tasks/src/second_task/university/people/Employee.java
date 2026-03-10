package second_task.university.people;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private BigDecimal salary;
    private LocalDate hireDate;

    public Employee(BigDecimal salary, LocalDate hireDate) {
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

}