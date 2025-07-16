import library.AdminUser;
import library.Book;
import library.Library;

public class Main {
    public static void main(String[] args) {
        Library titanLibrary = new Library();

        Book book1 = new Book(101L, "소년이 온다", "한강", 20000);
        Book book2 = new Book(102L, "Java 입문", "김동현", 30000);

        AdminUser sasha = new AdminUser("사샤", "potato@naver.com", "admin");

        sasha.addBookToLibrary(book1, titanLibrary);
        sasha.addBookToLibrary(book2, titanLibrary);

        titanLibrary.printAllBooks();

        sasha.removeBookFromLibrary(book2.getId(), titanLibrary);
        sasha.removeBookFromLibrary(99999L, titanLibrary);

        titanLibrary.printAllBooks();
    }
}