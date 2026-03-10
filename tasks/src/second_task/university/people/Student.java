package second_task.university.people;

public class Student extends Person {
    private int studentId;
    private boolean tuitionPaid = false;

    public Student(String name, int id) {
        super(name);
        this.studentId = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int id) {
        this.studentId = id;
    }

    public boolean isTuitionPaid() {
        return tuitionPaid;
    }

    public void setTuitionPaid(boolean paid) {
        this.tuitionPaid = paid;
    }
}