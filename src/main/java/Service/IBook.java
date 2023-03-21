package Service;

import Utils.ArrayListCustom;
import thuvien.Book;

public interface IBook {
    boolean addBook(Book book);
    boolean updateBook(int index, Book book);
    boolean removedBook(int id);
    ArrayListCustom<Book> getAllBookList();
    Book getBookById(int id);
}
