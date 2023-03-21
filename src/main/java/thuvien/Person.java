package thuvien;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(){}
    public Person(int id, String name, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        address = scanner.nextLine();
        System.out.println("Nhập email: ");
        email = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        phone = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
