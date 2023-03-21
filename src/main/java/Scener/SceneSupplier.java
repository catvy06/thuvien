package Scener;

import Manager.SupplierManager;
import Service.ISupplier;
import Utils.ArrayListCustom;
import thuvien.Supplier;

import java.util.Scanner;

public class SceneSupplier extends SceneMenuHelper<Supplier> {
    private SupplierManager supplierManager;
    Scanner sc = new Scanner(System.in);
    public SceneSupplier(ISupplier iSupplier){
        supplierManager = new SupplierManager(iSupplier);
        add(this::showMenu);
        add(this::add);
        add(this::update);
        add(this::removed);
        add(this::searchSupplierById);
        add(this::searchSupplierByName);
        add(this::display);
    }

    //    public static SupplierScener getInstance(){
//        if(!super.init()){
//            showMenu();
//        }
//    }
    public void add(){
        System.out.println("Nhập số lượng phần tử cần thêm: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            Supplier supplier = new Supplier();
            supplier.nhap();
            supplierManager.addSupplier(supplier);
        }
    }
    public boolean update(){
        System.out.println("Nhập id nhà cung cấp cần cập nhật: ");
        int id = sc.nextInt();
        Supplier supplier = new Supplier();
        supplier.nhap();
        if(supplierManager.updateSupplier(id, supplier)){
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
        if(supplierManager.removedSupplier(id)){
            System.out.println("Xóa thành công !");
            return true;
        }else {
            System.out.println("Id không tồn tại !");
            return false;
        }
    }
    public void searchSupplierById(){
        return;
    }
    public void searchSupplierByName(){
        return;
    }
    public void display(){
        ArrayListCustom<Supplier> suppliers = supplierManager.getList();
        for(int i = 0; i < suppliers.size() ; i++){
            System.out.println(suppliers.get(i).toString());
        }
    }
    public void showMenu(){
        System.out.println("1. Thêm nhà cung cấp.");
        System.out.println("2. Cập nhật nhà cung cấp");
        System.out.println("3. Xóa nhà cung cấp");
        System.out.println("4. Tìm kiếm nhà cung cấp theo id");
        System.out.println("5. Tìm kiếm nhà cung cấp theo tên");
        System.out.println("6. Xem danh sách nhà cung cấp");
        System.out.println("7. Quay lại trang chủ");
        chooseInput();
        this.showMenu();
    }
}
