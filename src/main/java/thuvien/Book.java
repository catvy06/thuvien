package thuvien;

import Manager.BookManager;
import Utils.ArrayListCustom;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import static thuvien.WriteFile.pathFile;

public class Book implements Serializable {
    private int id;
    private String title;
    private int authorid;
    private int supplierid;
    private int catalogid;

    private Category category;
    private String year;
    private String status;
    private int quantity;

    public Book (){}
    public Book(int id, String title, int authorid, int supplierid, int catalogid, String year, String status, int quantity) {
        this.id = id;
        this.title = title;
        this.authorid = authorid;
        this.supplierid = Book.this.supplierid;
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

    public int getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = Book.this.supplierid;
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

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
//        do {
//
//        }while (checkBookById(id));
        System.out.print("Nhập id sách: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        title = scanner.nextLine();
        System.out.print("Nhập id tác giả: ");
        authorid = scanner.nextInt();
        System.out.print("Nhập id nhà sản xuất: ");
        supplierid = scanner.nextInt();
        System.out.println("Nhập số lượng: ");
        quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        year = scanner.nextLine();
        System.out.println("Nhập trạng thái: ");
        status = scanner.nextLine();
        System.out.println("Nhập id danh mục: ");
        catalogid = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorid=" + authorid +
                ", supplierid=" + supplierid +
                ", catalogid=" + catalogid +
                ", year='" + year + '\'' +
                ", status=" + status +
                ", quantity=" + quantity +
                '}';
    }

//    public boolean checkBookById(int id, ArrayListCustom<Book> books){
//        for(int i = 0 ; i < books.size() ; i++)
//            if(books.get(i).getId() == id)
//                return true;
//        return false;
//    }
}
