package Service.Implements;

import Service.IAuthor;
import Utils.ArrayListCustom;
import thuvien.Author;

public class AuthorService implements IAuthor {
    private ArrayListCustom<Author> authorList;

    public AuthorService(){
        authorList = new ArrayListCustom<>();
    }
    @Override
    public boolean addAuthor(Author author) {
        try{
            authorList.add(author);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi thêm phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean updateAuthor(int index, Author author) {
        try{
            authorList.update(index, author);
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi cập nhật phần tử !!!");
        }
        return false;
    }

    @Override
    public boolean removedAuthor(int id) {
        try {
            authorList.removed(id);
        } catch (Exception ex) {
            System.out.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

    @Override
    public ArrayListCustom<Author> getAllAuthorList() {
        return authorList;
    }

    @Override
    public Author getBookById(int id) {
        return null;
    }

    @Override
    public Author getAuthorById(int id) {
        return null;
    }
}
