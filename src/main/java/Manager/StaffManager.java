package Manager;

import Service.IStaff;
import Utils.ArrayListCustom;
import thuvien.Staff;

public class StaffManager{
    private IStaff iStaff;
    public StaffManager(IStaff iStaff){
        this.iStaff = iStaff;
    }
    public boolean addStaff(Staff staff){
        return iStaff.addStaff(staff);
    }

    public boolean updateStaff(int id, Staff staff){
        ArrayListCustom<Staff> staffs = this.getList();
        for(int i = 0; i < staffs.size(); i++){
            if(staffs.get(i).getId() == id){
                return iStaff.updateStaff(i, staff);
            }
        }
        return false;
    }

    public boolean removedStaff(int id){
        try{
            ArrayListCustom<Staff> staffs = this.getList();
            for(int i = 0; i < staffs.size() ; i++){
                if(staffs.get(i).getId() == id){
                    return iStaff.removedStaff(i);
                }
            }
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

//    public boolean removedStaff(Staff staff){
//        try{
//            ArrayListCustom<Staff> staffs = this.getList();
//            for(int i = 0; i < staffs.size() ; i++){
//                if(staffs.get(i).equals(staffs)){
//                    return iStaff.removedStaff(staffs);
//                }
//            }
//        }catch (Exception ex){
//            System.err.println("Co loi xay ra khi xoa phan tu !!!");
//        }
//        return false;
//    }

    public ArrayListCustom<Staff> getList(){
        try{
            return iStaff.getAllStaffList();
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xuất phần tử !!!");
        }
        return null;
    }
}
