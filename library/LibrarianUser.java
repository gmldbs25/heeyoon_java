package library;

import library.exception.BookNotFoundException;

import java.net.StandardSocketOptions;
import java.util.List;

public class LibrarianUser extends StaffUser {
    
    public void printLibraryReport (Library library) {
        List<Book> books = library.getBooks();
        System.out.println(library.getName() + " 도서관이 소유한 총 책 갯수 : " + books.size());
        int i = 1;
        for (Book book : books) {
            System.out.println("[" + i++ + "]");
            book.printInfo();
        }        
    }

    public void findBookTitleById (Long id, Library library) {
        try {
            Book book = library.findBookWithId(id);
            System.out.println(library.getName() + " 도서관에서 id: " + book.getId() + " 의 책을 찾았습니다. 책 제목: " + book.getTitle());
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public LibrarianUser (String name, String email) {
        super(name, email);
    }
}
