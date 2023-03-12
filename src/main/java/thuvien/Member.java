package thuvien;

import java.util.List;

public class Member extends Person{
    private Book[] borrowedBooks;
    private int numBorrowedBooks;

    public Member(int id, String name, String address, String phone, String email) {
        super(id, name, address, phone, email);
        this.borrowedBooks = new Book[10];
        this.numBorrowedBooks = 0;
    }

}
