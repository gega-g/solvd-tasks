package second_task.university;

import second_task.university.courses.Course;
import second_task.university.infrastructure.*;
import second_task.university.people.Employee;
import second_task.university.people.Lecturer;
import second_task.university.people.SecurityGuard;
import second_task.university.people.Student;
import second_task.university.services.EnrollmentService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Lecturer drSmith = new Lecturer("Dr. Smith", new BigDecimal("2500.00"), LocalDate.of(2015, 5, 10), "CS", new String[]{"Java Basics"});
        Student johnDoe = new Student("John Doe", 1);
        Course javaCourse = new Course("Intro to Java", 2);
        EnrollmentService service = new EnrollmentService();

        service.enrollStudent(johnDoe, javaCourse); // Fails
        johnDoe.setTuitionPaid(true);
        service.enrollStudent(johnDoe, javaCourse); // Succeeds

        Library centralLib = new Library("Central Library", 2000);
        System.out.println("\nBuilding: " + centralLib.getBuildingName() + " | Books: " + centralLib.getBookCount());

        Auditory hallA = new Auditory("Science Wing", 101);
        System.out.println("Assigned Room: #" + hallA.getRoomNumber() + " in " + hallA.getBuildingName());

        Laboratory chemLab = new Laboratory("Tesla Lab", "Microscope", new BigDecimal("5000.75"));

        SecurityGuard guard = new SecurityGuard(new BigDecimal("1800.00"), LocalDate.now(), "Night");

        Building[] allBuildings = {centralLib, hallA, chemLab};
        Employee[] allStaff = {drSmith, guard};

        University myUni = new University("BTU", allBuildings, allStaff);

        System.out.println("\n--- Hierarchy Examples ---");
        System.out.println("Laboratory Budget: " + chemLab.getBuildingName() + " has specific safety funds.");

        System.out.println("Security Guard Shift: " + guard.getShift());
        System.out.println("Security Guard Salary: " + guard.getSalary());
        System.out.println("Lecturer Dept: " + drSmith.getDepartment());
    }
}