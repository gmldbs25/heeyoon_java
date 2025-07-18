package library;

public class Book {
    private Long id;
    private String title;
    private String author;
    private int price;

    public Book(Long id, String title, String author, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Book ID: " + this.id);
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
        System.out.println("Book price: " + this.price);
    }

    public void discount(int percent) {
        this.price = (int)(this.price * (1 - (percent/100.0)));
    }

    public Long getId() {
        return this.id;
    }
    
    public String getTitle() {
        return this.title;
    }
}
