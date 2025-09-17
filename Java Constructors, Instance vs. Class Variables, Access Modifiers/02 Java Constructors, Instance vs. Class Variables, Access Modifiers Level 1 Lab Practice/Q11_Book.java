class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Size: " + fileSize + "MB");
    }

    public static void main(String[] args) {
        EBook e = new EBook("12345", "Java Basics", "John Doe", 2.5);
        e.display();
    }
}