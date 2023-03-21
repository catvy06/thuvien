package Service.Implements;

import Service.ISupplier;
import Utils.ArrayListCustom;
import thuvien.Supplier;

public class SupplierService implements ISupplier {
    private ArrayListCustom<Supplier> supplierList;

    public SupplierService(){
        supplierList = new ArrayListCustom<>();
    }
    @Override
    public boolean addSupplier(Supplier supplier) {
        try{
            supplierList.add(supplier);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi thêm phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean updateSupplier(int index, Supplier supplier) {
        try{
            supplierList.update(index, supplier);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi cập nhật phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean removedSupplier(int id) {
        try {
            supplierList.removed(id);
        } catch (Exception ex) {
            System.out.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

    @Override
    public ArrayListCustom<Supplier> getAllSupplierList() {
        return supplierList;
    }

    @Override
    public Supplier getSupplierById(int id) {
        return null;
    }
}
