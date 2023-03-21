package Scener;

import Manager.CategoryManager;
import Service.ICategory;
import Utils.ArrayListCustom;
import thuvien.Category;

import java.util.Scanner;

public class SceneCategory extends SceneMenuHelper<Category> {
    private CategoryManager categoryManager;
    Scanner sc = new Scanner(System.in);
    public SceneCategory(ICategory iCategory){
        categoryManager = new CategoryManager(iCategory);
        add(this::showMenu);
        add(this::add);
        add(this::update);
        add(this::removed);
        add(this::searchCategoryById);
        add(this::searchCategoryByName);
        add(this::display);
    }

    //    public static CategoryScener getInstance(){
//        if(!super.init()){
//            showMenu();
//        }
//    }
    public void add(){
        System.out.println("Nhập số lượng phần tử cần thêm: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            Category category = new Category();
            category.nhap();
            categoryManager.addCategory(category);
        }
    }
    public boolean update(){
        System.out.println("Nhap id danh mục cần cập nhật: ");
        int id = sc.nextInt();
        Category category = new Category();
        category.nhap();
        if(categoryManager.updateCategory(id, category)){
            System.out.println("Cập nhật thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public boolean removed(){
        System.out.println("Nhap id danh mục cần xóa: ");
        int id = sc.nextInt();
        if(categoryManager.removedCategory(id)){
            System.out.println("Xóa thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public void searchCategoryById(){
        return;
    }
    public void searchCategoryByName(){
        return;
    }
    public void display(){
        ArrayListCustom<Category> books = categoryManager.getList();
        for(int i = 0; i < books.size() ; i++){
            System.out.println(books.get(i).toString());
        }
    }
    public void showMenu(){
        System.out.println("1. Thêm danh mục.");
        System.out.println("2. Cập nhật danh mục");
        System.out.println("3. Xóa danh mục");
        System.out.println("4. Tìm kiếm danh mục theo id");
        System.out.println("5. Tìm kiếm danh mục theo tên");
        System.out.println("6. Xem danh sách các danh mục");
        System.out.println("7. Quay lại trang chủ");
        chooseInput();
    }
}
