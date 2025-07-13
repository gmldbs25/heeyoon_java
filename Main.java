import library.Book;
import library.Library;
import library.User;

public class Main {
    public static void main(String[] args) {
        Library titanLibrary = new Library();

        Book book1 = new Book(101L, "소년이 온다", "한강", 20000);
        Book book2 = new Book(102L, "Java 입문", "김동현", 30000);

        titanLibrary.addBook(book1);
        titanLibrary.addBook(book2);
        User sasha = new User("사샤", "potato@naver.com");

        sasha.borrowBook(book1);
        titanLibrary.removeBook(book1.getId());

        sasha.getBorrowedBooks();
        System.out.println("titanLibrary 에서 빌릴 수 있는 책 목록.");
        titanLibrary.printAllBooks();
    }
}