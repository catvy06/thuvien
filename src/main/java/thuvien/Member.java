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

//    public void addborrowBook(Book book){
//        if (numBorrowedBooks<borrowedBooks.length){
//                borrowedBooks[numBorrowedBooks] = book;
//                numBorrowedBooks++;
//        } else {
//            System.out.println("Cannot borrow more books.");
//        }
//    }



//    public void returnBook(Book book){
//        for (int i = 0; i < numBorrowedBooks; i++){
//            if (borrowedBooks[i].equals(book)){
//                borrowedBooks[i]=null;
//                numBorrowedBooks--;
//                for (int j = i; j> numBorrowedBooks; j++){
//                    borrowedBooks[j]=borrowedBooks[j+1];
//                }
//                borrowedBooks[numBorrowedBooks] = null;
//                break;
//            }
//        }
//    }
}
