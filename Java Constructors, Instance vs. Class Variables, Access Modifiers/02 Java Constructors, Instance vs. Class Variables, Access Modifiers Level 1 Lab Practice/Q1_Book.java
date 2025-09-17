class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    public void displayDetails() {
        System.out.println(title + " by " + author + " | $" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "John Doe", 29.99);
        Book b3 = new Book(b2);
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}