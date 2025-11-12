import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainApp {
    public static void main(String[] args) {
        // Adding a new book
        Book book = new Book("Java Programming", "James Gosling", 101);
        book.displayBook();

        // Registering a new member
        Member member = new Member("Devang Verma", 1);
        member.displayMember();

        // Issuing the book
        Transaction transaction = new Transaction();
        transaction.issueBook(book, member);
    }
}
