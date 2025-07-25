package library;

import library.exception.BookNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final String name;
    private final List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }

    public Book findBookWithId(Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException(id));
    }

    public boolean hasBook(Long id) {
        return books.stream().anyMatch(book -> book.getId().equals(id));
    }

    public void printAllBooks() {
        for (Book book : books) {
            book.printInfo();
        }
    }

    public String getName() {
        return this.name;
    }

    public List<Book> getBooks() {
        return books;
    }
}
