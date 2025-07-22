import library.AdminUser;
import library.Book;
import library.Borrowable;
import library.LibrarianUser;
import library.Library;

public class Main {
    public static void main(String[] args) {
        Library titanLibrary = new Library("titanLibrary");

        Book book1 = new Book(101L, "소년이 온다", "한강", 20000);
        Book book2 = new Book(102L, "Java 입문", "김동현", 30000);
        Book book3 = new Book(103L, "진격의 거인", "에렌예거", 300000);
        
        AdminUser sasha = new AdminUser("사샤", "potato@naver.com", "admin");

        sasha.addBookToLibrary(book1, titanLibrary);
        sasha.addBookToLibrary(book2, titanLibrary);
        sasha.addBookToLibrary(book3, titanLibrary);

        titanLibrary.printAllBooks();

        Borrowable coni = new AdminUser("coni", "clever@naver.com", "admin");
        coni.borrowBook(book2, titanLibrary);
        sasha.borrowBook(book3, titanLibrary);
        System.out.println(titanLibrary.hasBook(book3.getId()));
        
        titanLibrary.printAllBooks();
        sasha.returnBook(book3, titanLibrary);
        titanLibrary.printAllBooks();
        System.out.println(titanLibrary.hasBook(book3.getId()));

        LibrarianUser jang = new LibrarianUser("jang", "ilovemom@naver.com");
        jang.findBookTitleById(101L, titanLibrary);
        jang.printLibraryReport(titanLibrary);
    }
}




