import thuvien.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ManagerBook managerBook = new ManagerBook();
        Book book = new Book(4,"Book4",1,1,1,"2001","true",5);
        managerBook.add(book);
        managerBook.xuat();

//        Book book = new Book(4,"Book4","Minh Hêu","NXB3",8,true);
//        library.updateBook(book);
//        Book book = library.searchBookById(1);
//        System.out.println(book.getId());
//        Member member = library.searchMemberById(1);
//        System.out.println(member.getId());
//        library.borrowBook(book,member);
    }
}
