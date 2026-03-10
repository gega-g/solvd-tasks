package second_task.university.infrastructure;

public class Library extends Building {
    private int bookCount;

    public Library(String name, int books) {
        super(name);
        this.bookCount = books;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int b) {
        this.bookCount = b;
    }
}