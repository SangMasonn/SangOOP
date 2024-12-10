
package OOP8;
import java.util.*;
public class BookList {
    private ArrayList<Book> bookList = new ArrayList<>();

    // Add new book
    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added: " + book.getId());
    }


    // Delete book by ID
    public void deleteBookById(String id) {
        bookList.removeIf(book -> book.getId().equals(id));
        System.out.println("Book deleted: " + id);
    }

    // Find book by ID
    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        System.out.println("Book not found: " + id);
        return null;
    }

    // Display all books
    public void displayAllBooks() {
        for (Book book : bookList) {
            book.displayDetails();
        }
    }
}
