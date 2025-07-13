package library;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    List<Book> borrowedBooks;

    public User (String name, String email) {
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    public void printUser() {
        System.out.println("User Name: " + this.name);
        System.out.println("User email: " + this.email);
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
        System.out.println(this.name + "님이 '" + book.getTitle() + "' 을 빌렸습니다.");
    }

    public void getBorrowedBooks () {
        System.out.println(this.name + "님이 빌리신 책 목록.");
        for (Book book : this.borrowedBooks) {
            book.printInfo();
        }
    }
}