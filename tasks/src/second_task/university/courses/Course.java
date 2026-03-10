package second_task.university.courses;

import second_task.university.people.Student;

public class Course {
    private String title;
    private int capacity;
    private int enrolledCount;
    private Student[] students;

    public Course(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.students = new Student[capacity];
        this.enrolledCount = 0;
    }

    public int getEnrolledCount() {
        return enrolledCount;
    }

    public void setEnrolledCount(int enrolledCount) {
        this.enrolledCount = enrolledCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student s) {
        students[enrolledCount++] = s;
    }
}
