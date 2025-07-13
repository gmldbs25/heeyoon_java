package library;

public class User {
    private String name;
    private String email;

    public User (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printUser() {
        System.out.println("User Name: " + this.name);
        System.out.println("User email: " + this.email);
    }
}
