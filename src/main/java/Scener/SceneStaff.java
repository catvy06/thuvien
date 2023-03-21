package Scener;

import Manager.StaffManager;
import Service.IStaff;
import Utils.ArrayListCustom;
import thuvien.Staff;

import java.util.Scanner;

public class SceneStaff extends SceneMenuHelper<Staff> {
    private StaffManager staffManager;
    Scanner sc = new Scanner(System.in);
    public SceneStaff(IStaff iStaff){
        staffManager = new StaffManager(iStaff);
        add(this::showMenu);
        add(this::add);
        add(this::update);
        add(this::removed);
        add(this::searchStaffById);
        add(this::searchStaffByName);
        add(this::display);
    }

    //    public static StaffScener getInstance(){
//        if(!super.init()){
//            showMenu();
//        }
//    }
    public void add(){
        System.out.println("Nhập số lượng phần tử cần thêm: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            Staff staff = new Staff();
            staff.nhap();
            staffManager.addStaff(staff);
        }
    }
    public boolean update(){
        System.out.println("Nhập id nhà cung cấp cần cập nhật: ");
        int id = sc.nextInt();
        Staff staff = new Staff();
        staff.nhap();
        if(staffManager.updateStaff(id, staff)){
            System.out.println("Cập nhật thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public boolean removed(){
        System.out.println("Nhập id nhà cung cấp cần xóa: ");
        int id = sc.nextInt();
        if(staffManager.removedStaff(id)){
            System.out.println("Xóa thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public void searchStaffById(){
        return;
    }
    public void searchStaffByName(){
        return;
    }
    public void display(){
        ArrayListCustom<Staff> staffs = staffManager.getList();
        for(int i = 0; i < staffs.size() ; i++){
            System.out.println(staffs.get(i).toString());
        }
    }
    public void showMenu(){
        System.out.println("1. Thêm nhân viên.");
        System.out.println("2. Cập nhật nhân viên");
        System.out.println("3. Xóa nhân viên");
        System.out.println("4. Tìm kiếm nhân viên theo id");
        System.out.println("5. Tìm kiếm nhân viên theo tên");
        System.out.println("6. Xem danh sách nhân viên");
        System.out.println("7. Quay lại trang chủ");
        chooseInput();
        this.showMenu();
    }
}
