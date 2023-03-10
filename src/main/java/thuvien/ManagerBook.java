package thuvien;

import java.util.Scanner;

public class ManagerBook {
    int n = 0;
    private Book[] list = new Book[100];
    public void add(Book book){
        Book book1 = new Book();
        System.out.println("Nhập số lượng cần thêm: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i =0; i<n; i++){
            list[i] = new Book();
            list[i].nhap();
        }
    }

    public void xuat(){
        for (int i = 0; i< list.length; i++){
            list[i] = new Book();
            System.out.println(list[i].toString());
        }
    }
}
