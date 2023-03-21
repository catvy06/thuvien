package Service.Implements;

import Service.IBook;
import Utils.ArrayListCustom;
import thuvien.Book;

public class BookService implements IBook {
    private ArrayListCustom<Book> bookList;

    public BookService(){
        bookList = new ArrayListCustom<>();
    }
    @Override
    public boolean addBook(Book book) {
        try{
            bookList.add(book);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi thêm phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean updateBook(int index, Book book) {
        try{
            bookList.update(index, book);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi cập nhật phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean removedBook(int id) {
        try {
            bookList.removed(id);
        } catch (Exception ex){
            System.out.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

    @Override
    public ArrayListCustom<Book> getAllBookList() {
        return bookList;
    }

    @Override
    public Book getBookById(int id) {
        return null;
    }
}
