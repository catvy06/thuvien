package Manager;

import Service.IAccount;
import thuvien.Account;
import Utils.ArrayListCustom;

public class AccountManager {
    private IAccount iAccount;
    public AccountManager(IAccount iAccount){
        this.iAccount = iAccount;
    }
    public boolean addAccount(Account account){
        return iAccount.addAccount(account);
    }

    public boolean updateAccount(String username, Account account){
        ArrayListCustom<Account> accounts = this.getList();
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getUsername().equals(username)){
                return iAccount.updateAccount(i, account);
            }
        }
        return false;
    }

    public boolean removedAccount(String username){
        try{
            ArrayListCustom<Account> accounts = this.getList();
            for(int i = 0; i < accounts.size() ; i++){
                if(accounts.get(i).getUsername().equals(username)){
                    return iAccount.removedAccount(i);
                }
            }
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

//    public boolean removedAccount(Account account){
//        try{
//            ArrayListCustom<Account> accounts = this.getList();
//            for(int i = 0; i < accounts.size() ; i++){
//                if(accounts.get(i).equals(accounts)){
//                    return iAccount.removedAccount(accounts);
//                }
//            }
//        }catch (Exception ex){
//            System.err.println("Co loi xay ra khi xoa phan tu !!!");
//        }
//        return false;
//    }

    public ArrayListCustom<Account> getList(){
        try{
            return iAccount.getAllAccountList();
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xuất phần tử !!!");
        }
        return null;
    }
}

