package Scener;

import Manager.AuthorManager;
import Service.IAuthor;
import Utils.ArrayListCustom;
import thuvien.Author;

import java.util.Scanner;

public class SceneAuthor extends SceneMenuHelper<Author> {
    private AuthorManager authorManager;
    Scanner sc = new Scanner(System.in);
    public SceneAuthor(IAuthor iAuthor){
        authorManager = new AuthorManager(iAuthor);
        add(this::showMenu);
        add(this::add);
        add(this::update);
        add(this::removed);
        add(this::searchAuthorById);
        add(this::searchAuthorByName);
        add(this::display);
    }

    //    public static AuthorScener getInstance(){
//        if(!super.init()){
//            showMenu();
//        }
//    }
    public void add(){
        System.out.println("Nhập số lượng phần tử cần thêm: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            Author author = new Author();
            author.nhap();
            authorManager.addAuthor(author);
        }
    }
    public boolean update(){
        System.out.println("Nhập id tác giả cần cập nhật: ");
        int id = sc.nextInt();
        Author author = new Author();
        author.nhap();
        if(authorManager.updateAuthor(id, author)){
            System.out.println("Cập nhật thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public boolean removed(){
        System.out.println("Nhập id tác giả cần xóa: ");
        int id = sc.nextInt();
        if(authorManager.removedAuthor(id)){
            System.out.println("Xóa thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public void searchAuthorById(){
        return;
    }
    public void searchAuthorByName(){
        return;
    }
    public void display(){
        ArrayListCustom<Author> authors = authorManager.getList();
        for(int i = 0; i < authors.size() ; i++){
            System.out.println(authors.get(i).toString());
        }
    }
    public void showMenu(){
        System.out.println("1. Thêm tác giả.");
        System.out.println("2. Cập nhật tác giả");
        System.out.println("3. Xóa tác giả");
        System.out.println("4. Tìm kiếm tác giả theo id");
        System.out.println("5. Tìm kiếm tác giả theo tên");
        System.out.println("6. Xem danh sách tác giả");
        System.out.println("7. Quay lại trang chủ");
        chooseInput();
        this.showMenu();
    }
}
