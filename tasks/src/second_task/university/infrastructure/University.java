package second_task.university.infrastructure;

import second_task.university.people.Employee;

public class University {
    private String uniName;
    private Building[] buildings;
    private Employee[] employees;

    public University(String name, Building[] buildings, Employee[] employees) {
        this.uniName = name;
        this.buildings = buildings;
        this.employees = employees;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

}