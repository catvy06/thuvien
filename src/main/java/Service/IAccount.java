package Service;

import Utils.ArrayListCustom;
import thuvien.Account;

public interface IAccount {
    boolean addAccount(Account account);
    boolean updateAccount(int index, Account account);
    boolean removedAccount(Object obj);
    ArrayListCustom<Account> getAllAccountList();
    Account getAccountById(String username);
}
