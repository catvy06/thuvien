package Manager;

import Service.IAuthor;
import Utils.ArrayListCustom;
import thuvien.Author;

public class AuthorManager{
    private IAuthor iAuthor;
    public AuthorManager(IAuthor iAuthor){
        this.iAuthor = iAuthor;
    }
    public boolean addAuthor(Author author){
        return iAuthor.addAuthor(author);
    }

    public boolean updateAuthor(int id, Author author){
        ArrayListCustom<Author> authors = this.getList();
        for(int i = 0; i < authors.size(); i++){
            if(authors.get(i).getId() == id){
                return iAuthor.updateAuthor(i, author);
            }
        }
        return false;
    }

    public boolean removedAuthor(int id){
        try{
            ArrayListCustom<Author> authors = this.getList();
            for(int i = 0; i < authors.size() ; i++){
                if(authors.get(i).getId() == id){
                    return iAuthor.removedAuthor(i);
                }
            }
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

//    public boolean removedAuthor(Author author){
//        try{
//            ArrayListCustom<Author> authors = this.getList();
//            for(int i = 0; i < authors.size() ; i++){
//                if(authors.get(i).equals(authors)){
//                    return iAuthor.removedAuthor(authors);
//                }
//            }
//        }catch (Exception ex){
//            System.err.println("Co loi xay ra khi xoa phan tu !!!");
//        }
//        return false;
//    }

    public ArrayListCustom<Author> getList(){
        try{
            return iAuthor.getAllAuthorList();
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xuất phần tử !!!");
        }
        return null;
    }
}
