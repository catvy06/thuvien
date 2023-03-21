package Service.Implements;

import Service.IAccount;
import Utils.ArrayListCustom;
import thuvien.Account;

public class AccountService implements IAccount {
    private ArrayListCustom<Account> accountList;

    public AccountService(){
        accountList = new ArrayListCustom<>();
    }
    @Override
    public boolean addAccount(Account account) {
        try{
            accountList.add(account);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi thêm phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean updateAccount(int index, Account account) {
        try{
            return accountList.update(index, account);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi cập nhật phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean removedAccount(Object obj) {
        try{
            return accountList.removed(obj);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

    @Override
    public ArrayListCustom<Account> getAllAccountList() {
        return accountList;
    }

    @Override
    public Account getAccountById(String username) {
        return null;
    }
}
