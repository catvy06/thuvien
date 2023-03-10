package thuvien;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import static thuvien.WriteFile.pathFile;

public class Book {
    private int id;
    private String title;
    private int authorid;
    private int publisherid;
    private int catalogid;
    private String year;
    private String status;
    private int quantity;

    public Book (){}
    public Book(int id, String title, int authorid, int publisherid, int catalogid, String year, String status, int quantity) {
        this.id = id;
        this.title = title;
        this.authorid = authorid;
        this.publisherid = publisherid;
        this.catalogid = catalogid;
        this.year = year;
        this.status = status;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public int getCatalogid() {
        return catalogid;
    }

    public void setCatalogid(int catalogid) {
        this.catalogid = catalogid;
    }

    public int getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(int publisherid) {
        this.publisherid = publisherid;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter authorid: ");
        int authorid = scanner.nextInt();
        System.out.print("Enter publisherid: ");
        int publisherid = scanner.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter year: ");
        String year = scanner.nextLine();
        System.out.println("Enter status: ");
        String status = scanner.nextLine();
        System.out.println("Enter catalogid: ");
        int catalogid = scanner.nextInt();

        Book book = new Book(id,title,authorid,publisherid,catalogid,year,status,quantity);
        return book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorid=" + authorid +
                ", publisherid=" + publisherid +
                ", catalogid=" + catalogid +
                ", year='" + year + '\'' +
                ", status=" + status +
                ", quantity=" + quantity +
                '}';
    }
}
