import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    public static class Book {
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Author: " + author + ", Year: " + year;
        }
    }

    public static class Library {
        private List<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(Book book) {
            books.remove(book);
        }

        public List<Book> getAllBooks() {
            return new ArrayList<>(books); // Return a copy of the list to prevent direct modifications
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("1984", "George Orwell", 1949));

        // Displaying all books in the library
        List<Book> allBooks = library.getAllBooks();
        for (Book book : allBooks) {
            System.out.println(book);
        }
    }
}
