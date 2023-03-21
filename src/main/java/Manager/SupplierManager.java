package Manager;

import Service.ISupplier;
import Utils.ArrayListCustom;
import thuvien.Supplier;

public class SupplierManager{
    private ISupplier iSupplier;
    public SupplierManager(ISupplier iSupplier){
        this.iSupplier = iSupplier;
    }
    public boolean addSupplier(Supplier supplier){
        return iSupplier.addSupplier(supplier);
    }

    public boolean updateSupplier(int id, Supplier supplier){
        ArrayListCustom<Supplier> suppliers = this.getList();
        for(int i = 0; i < suppliers.size(); i++){
            if(suppliers.get(i).getId() == id){
                return iSupplier.updateSupplier(i, supplier);
            }
        }
        return false;
    }

    public boolean removedSupplier(int id){
        try{
            ArrayListCustom<Supplier> suppliers = this.getList();
            for(int i = 0; i < suppliers.size() ; i++){
                if(suppliers.get(i).getId() == id){
                    return iSupplier.removedSupplier(i);
                }
            }
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

//    public boolean removedSupplier(Supplier supplier){
//        try{
//            ArrayListCustom<Supplier> suppliers = this.getList();
//            for(int i = 0; i < suppliers.size() ; i++){
//                if(suppliers.get(i).equals(suppliers)){
//                    return iSupplier.removedSupplier(suppliers);
//                }
//            }
//        }catch (Exception ex){
//            System.err.println("Co loi xay ra khi xoa phan tu !!!");
//        }
//        return false;
//    }

    public ArrayListCustom<Supplier> getList(){
        try{
            return iSupplier.getAllSupplierList();
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xuất phần tử !!!");
        }
        return null;
    }
}
