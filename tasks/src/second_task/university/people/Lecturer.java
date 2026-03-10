package second_task.university.people;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Lecturer extends Employee {
    private String name;
    private String department;
    private String[] publications;

    public Lecturer(String name, BigDecimal salary, LocalDate hired, String dept, String[] publications) {
        super(salary, hired);
        this.name = name;
        this.department = dept;
        this.publications = publications;
    }

    public String[] getPublications() {
        return publications;
    }

    public void setPublications(String[] publications) {
        this.publications = publications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}