import thuvien.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void chay(){
        luachon();
        Scanner scanner = new Scanner(System.in);
        int chon = scanner.nextInt();
        switch (chon){
            case 1: {
                ManagerBook managerBook = new ManagerBook();
                Book[] books = managerBook.add();
                managerBook.save(books);
                chay();
            }
            case 2: {
                System.out.println("Đang cập nhật!!!!!");
                System.exit(0);
            }
            case 5: {
                ManagerBook managerBook = new ManagerBook();
                managerBook.getAll();
            }
            case 7: {
                System.exit(0);
            }
        }
    }

    public static void luachon(){
        System.out.println("1. Thêm sách.");
        System.out.println("2. Cập nhật sách");
        System.out.println("3. Xóa sách");
        System.out.println("4. Mượn sách");
        System.out.println("5. Xem danh sách các đầu sách");
        System.out.println("6. Xem danh sách tác giả");
        System.out.println("7. Đóng");
    }
    public static void main(String[] args){
        chay();
    }
}