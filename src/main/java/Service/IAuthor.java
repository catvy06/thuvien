package Service;

import Utils.ArrayListCustom;
import thuvien.Author;

public interface IAuthor {
    boolean addAuthor(Author author);
    boolean updateAuthor(int index, Author author);
    boolean removedAuthor(int id);
    ArrayListCustom<Author> getAllAuthorList();
    Author getBookById(int id);

    Author getAuthorById(int id);
}
