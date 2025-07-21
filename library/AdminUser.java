package library;

public class AdminUser extends StaffUser {
    private String role;

    public AdminUser (String name, String email, String role) {
        super(name, email);
        this.role = role;
    }

    public void printAdminInfo() {
        System.out.println("User Name: " + name);
        System.out.println("User Email: " + email);
        System.out.println("User Role: " + role);
    }

    public void addBookToLibrary(Book book, Library library) {
        library.addBook(book);
        System.out.println("관리자'" + this.name + "'님이 책을 추가했습니다 - 책 제목: [" + book.getTitle() + "]");
    }

    public void removeBookFromLibrary(Long id, Library library) {
        Book bookToRemove = library.findBookWithId(id);
        if (bookToRemove != null){
            System.out.println("관리자'" + this.name + "'님이 책을 제거했습니다 - 책 ID: [" + id + "], 책 제목: [" + bookToRemove.getTitle() + "]");
            library.removeBook(id);
        } else {
            System.out.println("관리자'" + this.name + "'님이 책을 제거하려는 책을 찾지 못했습니다 - 찾지 못한 책 ID: [" + id + "]");            
        }
    }
}