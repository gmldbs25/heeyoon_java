package library;

import java.util.ArrayList;
import java.util.List;

public class User implements Borrowable {
    protected String name;
    protected String email;
    protected List<Book> borrowedBooks;

    public User (String name, String email) {
        this.name = name;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
    }

    public void printUser() {
        System.out.println("User Name: " + this.name);
        System.out.println("User email: " + this.email);
    }

    @Override
    public void borrowBook(Book book, Library library) {
        if (borrowedBooks.contains(book)){
            System.out.println("이미 대여 중인 책입니다.");
            return;
        }
        this.borrowedBooks.add(book);
        System.out.println(this.name + "님이 '" + book.getTitle() + "' 을 " + library.getName() + "도서관에서 빌렸습니다.");
        library.removeBook(book.getId());
    }

    public void getBorrowedBooks() {
        System.out.println(this.name + "님이 빌리신 책 목록.");
        for (Book book : this.borrowedBooks) {
            book.printInfo();
        }
    }

    @Override
    public void returnBook(Book book, Library library) {
        if (this.borrowedBooks.removeIf(tempbook -> tempbook.getId().equals(book.getId()))) {
            library.addBook(book);
            System.out.println(this.name + "님이 [" + book.getTitle() + "] 책을 " + library.getName() + "도서관에 반납했습니다.");
        } else {
            System.out.println(this.name + "님에게는 [" + book.getTitle() + "] 책이 없습니다.");
        }
    }
}

