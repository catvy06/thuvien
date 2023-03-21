package thuvien;

import java.util.Scanner;

public class Staff extends Person {

    public int salary;
    public int accountId;

    public Staff(){}
    public Staff(int id, String name, String address, String phone, String email, int salary, int accountId) {
        super(id, name, address, phone, email);
        this.salary = salary;
        this.accountId = accountId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                ", accountId=" + accountId +
                '}';
    }
}
