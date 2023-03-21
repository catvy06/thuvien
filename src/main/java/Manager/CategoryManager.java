package Manager;

import thuvien.Category;
import Service.ICategory;
import Utils.ArrayListCustom;

public class CategoryManager {
    private ICategory iCategory;
    public CategoryManager(ICategory iCategory){
        this.iCategory = iCategory;
    }
    public boolean addCategory(Category category){
        return iCategory.addCategory(category);
    }

    public boolean updateCategory(int id, Category category){
        ArrayListCustom<Category> categories = this.getList();
        for(int i = 0; i < categories.size(); i++){
            if(categories.get(i).getId() == id){
                return iCategory.updateCategory(i, category);
            }
        }
        return false;
    }

    public boolean removedCategory(int id){
        try{
            ArrayListCustom<Category> categories = this.getList();
            for(int i = 0; i < categories.size() ; i++){
                if(categories.get(i).getId() == id){
                    return iCategory.removedCategory(i);
                }
            }
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

//    public boolean removedCategory(Category category){
//        try{
//            ArrayListCustom<Category> categories = this.getList();
//            for(int i = 0; i < categories.size() ; i++){
//                if(categories.get(i).equals(categories)){
//                    return iCategory.removedCategory(categories);
//                }
//            }
//        }catch (Exception ex){
//            System.err.println("Co loi xay ra khi xoa phan tu !!!");
//        }
//        return false;
//    }

    public ArrayListCustom<Category> getList(){
        try{
            return iCategory.getAllCategoryList();
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xuất phần tử !!!");
        }
        return null;
    }
}
