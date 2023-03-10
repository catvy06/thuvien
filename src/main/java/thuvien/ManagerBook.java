package thuvien;

import java.util.Scanner;

public class ManagerBook {
    public Book[] add(){
        System.out.println("Nhập số lượng cần thêm: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Book[] list = new Book[n];
        for (int i =0; i<n; i++){
            Book book = new Book();
            list[i] = book.nhap();
        }
        return list;
    }

    public void xuat(Book[] books){
        for (int i = 0; i< books.length; i++){
            System.out.println(books[i].toString());
        }
    }
}
