package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library () {
        this.books = new ArrayList<>();
    }

    public void addBook (Book book) {
        this.books.add(book);
    }

    public void removeBook (Long id) {
    // #1. 기본 반복문 방식: ConcurrentModificationException 가능성 존재
    //     for (Book book : this.books) {
    //         if (book.getId() == id) {
    //             this.books.remove(book);
    //         }
    //     }
        
    // #2. Iterator 를 사용한 순차 탐색, 안전하게 요소 제거 가능(java 5이상)
    // Iterator<Book> iterator = this.books.iterator();
    // while(iterator.hasNext()) {
    //     Book book = iterator.next();
    //     if (book.getId().equals(id)) {
    //         iterator.remove();
    //     }
    // }
        // #3. removeIf 방식 (java 8 이상)
        this.books.removeIf(book -> book.getId().equals(id));
    }

    public Book findBookWithId (Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void printAllBooks() {
        for (Book book : this.books) {
            book.printInfo();
        }
    }
}
