class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed");
        } else {
            System.out.println(title + " not available");
        }
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java Pro", "John Doe", 40.0);
        b.borrowBook();
        b.borrowBook();
    }
}