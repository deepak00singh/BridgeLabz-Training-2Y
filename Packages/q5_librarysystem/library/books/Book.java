package library.books;

public class Book {
    private String title;
    private String author;
    private int bookId;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author);
    }

    public String getTitle() {
        return title;
    }
}
