package Scener;

import Configs.IService;
import Service.IAccount;
import Service.IBook;
import Service.ICategory;
import Service.Implements.AccountService;
import Service.Implements.BookService;
import Service.Implements.CategoryService;

import java.util.Scanner;

public class Menu extends SceneMenuHelper {
    Scanner sc = new Scanner(System.in);
    private IBook iBook = (BookService) new IService(IBook.class, BookService.class).AddScoped();
    private ICategory iCategory = (CategoryService) new IService(ICategory.class, CategoryService.class).AddScoped();
    private IAccount iAccount = (AccountService) new IService(IAccount.class, AccountService.class).AddScoped();
    public Menu(){
        add(this::showMenu);
        add(this::book);
        add(this::category);
        add(this::account);
    }
    public void book(){
        new SceneBook(iBook).display(0);
    }
    public void category(){
        new SceneCategory(iCategory).display(0);
    }
    public void account(){
        new SceneAccount(iAccount).display(0);
    }
    public void showMenu(){
        System.out.println("1. Quản lý sách.");
        System.out.println("2. Quản lý danh mục");
        System.out.println("3. Quản lý tài khoản");
        System.out.println("4. Đóng");
        chooseInput();
    }
}

