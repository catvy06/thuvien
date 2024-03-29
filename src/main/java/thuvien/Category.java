package thuvien;

import java.util.Scanner;

public class Category {
    public int id;
    public String name;
    public boolean status;

    public Category() {}

    public Category(int id, String name, boolean status){
        this.id = id;
        this.name = name;
        this.status = status;
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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id category: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ten category: ");
        name = scanner.nextLine();
    }
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
