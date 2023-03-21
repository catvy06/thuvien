package Service;

import Utils.ArrayListCustom;
import thuvien.Staff;

public interface IStaff {
    boolean addStaff(Staff staff);
    boolean updateStaff(int index, Staff staff);
    boolean removedStaff(int id);
    ArrayListCustom<Staff> getAllStaffList();

    Staff getStaffById(int id);
}
