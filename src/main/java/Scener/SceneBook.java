package Scener;

import Manager.BookManager;
import Service.IBook;
import Utils.ArrayListCustom;
import thuvien.Book;

import java.util.Scanner;

public class SceneBook extends SceneMenuHelper<Book> {
    private BookManager bookManager;
    Scanner sc = new Scanner(System.in);
    public SceneBook(IBook iBook){
        bookManager = new BookManager(iBook);
        add(this::showMenu);
        add(this::add);
        add(this::update);
        add(this::removed);
        add(this::searchBookById);
        add(this::searchBookByName);
        add(this::display);
    }

//    public static BookScener getInstance(){
//        if(!super.init()){
//            showMenu();
//        }
//    }
    public void add(){
        System.out.println("Nhập số lượng phần tử cần thêm: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            Book book = new Book();
            book.nhap();
            bookManager.addBook(book);
        }
    }
    public boolean update(){
        System.out.println("Nhập id sách cần cập nhật: ");
        int id = sc.nextInt();
        Book book = new Book();
        book.nhap();
        if(bookManager.updateBook(id, book)){
            System.out.println("Cập nhật thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public boolean removed(){
        System.out.println("Nhập id sách cần xóa: ");
        int id = sc.nextInt();
        if(bookManager.removedBook(id)){
            System.out.println("Xóa thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public void searchBookById(){
        return;
    }
    public void searchBookByName(){
        return;
    }
    public void display(){
        ArrayListCustom<Book> books = bookManager.getList();
        for(int i = 0; i < books.size() ; i++){
            System.out.println(books.get(i).toString());
        }
    }
    public void showMenu(){
        System.out.println("1. Thêm sách.");
        System.out.println("2. Cập nhật sách");
        System.out.println("3. Xóa sách");
        System.out.println("4. Tìm kiếm sách theo id");
        System.out.println("5. Tìm kiếm sách theo tên");
        System.out.println("6. Xem danh sách các đầu sách");
        System.out.println("7. Xem sách theo thể loại");
        System.out.println("8. Xem sách theo tác giả");
        System.out.println("9. Quay lại trang chủ");
        chooseInput();
        this.showMenu();
    }
}
