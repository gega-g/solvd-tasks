package second_task.university.people;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SecurityGuard extends Employee {
    private String shift;

    public SecurityGuard(BigDecimal salary, LocalDate hired, String shift) {
        super(salary, hired);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}