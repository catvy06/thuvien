package Service.Implements;

import Service.ICategory;
import Utils.ArrayListCustom;
import thuvien.Category;

public class CategoryService implements ICategory {
    private ArrayListCustom<Category> categoryList;

    public CategoryService(){
        categoryList = new ArrayListCustom<>();
    }
    @Override
    public boolean addCategory(Category category) {
        try{
            categoryList.add(category);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi thêm phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean updateCategory(int index, Category category) {
        try{
            categoryList.update(index, category);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi cập nhật phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean removedCategory(int id) {
        try {
            categoryList.removed(id);
        }catch (Exception ex){
            System.out.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

    @Override
    public ArrayListCustom<Category> getAllCategoryList() {
        return categoryList;
    }

    @Override
    public Category getCategoryById(int id) {
        return null;
    }
}
