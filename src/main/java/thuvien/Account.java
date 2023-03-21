package thuvien;

import Scener.SceneBook;

import java.util.Scanner;

public class Account {
    private String username;
    private String password;
    public Account(){

    }
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap username: ");
        username = scanner.nextLine();
        System.out.println("Nhap password: ");
        password = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
