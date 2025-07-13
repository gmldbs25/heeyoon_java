import library.Book;
import library.User;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(001, "소년이 온다", "한강", 20000);
        Book book2 = new Book(002, "Java 입문", "김동현", 30000);

        User user1 = new User("사샤", "potato@naver.com");

        System.out.println("Before Discount.");
        book1.printInfo();
        book2.printInfo();
        book1.discount(10);
        book2.discount(10);
        System.out.println("After Discount.");
        book1.printInfo();
        book2.printInfo();
        
        user1.printUser();
    }
    
}

