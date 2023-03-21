package Scener;

import Manager.AccountManager;
import Service.IAccount;
import Utils.ArrayListCustom;
import thuvien.Account;

import java.util.Scanner;

public class SceneAccount extends SceneMenuHelper<Account> {
    private AccountManager accountManager;
    Scanner sc = new Scanner(System.in);
    public SceneAccount(IAccount iAccount){
        accountManager = new AccountManager(iAccount);
        add(this::showMenu);
        add(this::add);
        add(this::update);
        add(this::removed);
        add(this::searchAccountById);
        add(this::searchAccountByName);
        add(this::display);
    }
    public void add(){
        System.out.println("Nhập số lượng phần tử cần thêm: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            Account account = new Account();
            account.nhap();
            accountManager.addAccount(account);
        }
    }
    public boolean update(){
        System.out.println("Nhập username cần cập nhật: ");
        String username = sc.nextLine();
        Account account = new Account();
        account.nhap();
        if(accountManager.updateAccount(username, account)){
            System.out.println("Cập nhật thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public boolean removed(){
        System.out.println("Nhập username cần xóa: ");
        String username = sc.nextLine();
        if(accountManager.removedAccount(username)){
            System.out.println("Xóa thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public void searchAccountById(){
        return;
    }
    public void searchAccountByName(){
        return;
    }
    public void display(){
        ArrayListCustom<Account> accounts = accountManager.getList();
        for(int i = 0; i < accounts.size() ; i++){
            System.out.println(accounts.get(i).toString());
        }
    }
    public void showMenu(){
        System.out.println("1. Đăng ký.");
        System.out.println("2. Cập nhật account");
        System.out.println("3. Xóa account");
        System.out.println("4. Tìm kiếm account theo username");
        System.out.println("5. Xem danh sách các account");
        System.out.println("6. Đóng");
        chooseInput();
    }
}

