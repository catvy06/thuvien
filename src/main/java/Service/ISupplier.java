package Service;

import Utils.ArrayListCustom;
import thuvien.Supplier;

public interface ISupplier {
    boolean addSupplier(Supplier supplier);
    boolean updateSupplier(int index, Supplier supplier);
    boolean removedSupplier(int id);
    ArrayListCustom<Supplier> getAllSupplierList();

    Supplier getSupplierById(int id);
}
