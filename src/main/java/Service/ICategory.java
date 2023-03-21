package Service;

import Utils.ArrayListCustom;
import thuvien.Category;

public interface ICategory {
    boolean addCategory(Category category);
    boolean updateCategory(int index, Category category);
    boolean removedCategory(int id);
    ArrayListCustom<Category> getAllCategoryList();
    Category getCategoryById(int id);
}