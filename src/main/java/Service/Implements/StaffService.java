package Service.Implements;

import Service.IStaff;
import Utils.ArrayListCustom;
import thuvien.Staff;

public class StaffService implements IStaff {
    private ArrayListCustom<Staff> staffList;

    public StaffService(){
        staffList = new ArrayListCustom<>();
    }
    @Override
    public boolean addStaff(Staff staff) {
        try{
            staffList.add(staff);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi thêm phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean updateStaff(int index, Staff staff) {
        try{
            staffList.update(index, staff);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi cập nhật phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean removedStaff(int id) {
        try {
            staffList.removed(id);
        } catch (Exception ex) {
            System.out.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

    @Override
    public ArrayListCustom<Staff> getAllStaffList() {
        return staffList;
    }

    @Override
    public Staff getStaffById(int id) {
        return null;
    }
}
