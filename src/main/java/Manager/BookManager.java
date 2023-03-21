package Manager;

import Service.IBook;
import Service.Implements.BookService;
import Utils.ArrayListCustom;
import thuvien.Book;

import java.io.Serializable;

public class BookManager{
    private IBook iBook;
    public BookManager(IBook iBook){
        this.iBook = iBook;
    }
    public boolean addBook(Book book){
        return iBook.addBook(book);
    }

    public boolean updateBook(int id, Book book){
        ArrayListCustom<Book> books = this.getList();
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getId() == id){
                return iBook.updateBook(i, book);
            }
        }
        return false;
    }

    public boolean removedBook(int id){
        try{
            ArrayListCustom<Book> books = this.getList();
            for(int i = 0; i < books.size() ; i++){
                if(books.get(i).getId() == id){
                    return iBook.removedBook(i);
                }
            }
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

//    public boolean removedBook(Book book){
//        try{
//            ArrayListCustom<Book> books = this.getList();
//            for(int i = 0; i < books.size() ; i++){
//                if(books.get(i).equals(books)){
//                    return iBook.removedBook(books);
//                }
//            }
//        }catch (Exception ex){
//            System.err.println("Co loi xay ra khi xoa phan tu !!!");
//        }
//        return false;
//    }

    public ArrayListCustom<Book> getList(){
        try{
            return iBook.getAllBookList();
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xuất phần tử !!!");
        }
        return null;
    }
}
