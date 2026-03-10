package second_task.university.infrastructure;

public class Auditory extends Building {
    private final int roomNumber;

    public Auditory(String name, int capacity) {
        super(name);
        this.roomNumber = capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
