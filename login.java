public class User {
    private String username;
    private String password;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        User user = new User("admin", "password123");

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Enter password: ");
        String passwordInput = scanner.nextLine();

        
        if (usernameInput.equals(user.getUsername()) && user.checkPassword(passwordInput)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        
        scanner.close();


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }


    public boolean checkPassword(String password) {
        return this.password.equals(password);

    }
}
