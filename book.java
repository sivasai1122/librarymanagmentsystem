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

    public static void main(String[] args) {
        // Creating a list to store books in the library
        List<Book> library = new ArrayList<>();

        // Adding books to the library
        library.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        library.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.add(new Book("1984", "George Orwell", 1949));

        // Displaying all books in the library
        for (Book book : library) {
            System.out.println(book);
        }
    }
}
