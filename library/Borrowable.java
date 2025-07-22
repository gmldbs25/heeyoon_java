package library;

public interface Borrowable {
    void borrowBook(Book book, Library library);
    void returnBook(Book book, Library library);
}