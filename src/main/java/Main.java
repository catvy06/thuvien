import Configs.IService;
import Scener.*;
import Service.IAccount;
import Service.IBook;
import Service.ICategory;
import Service.Implements.AccountService;
import Service.Implements.BookService;
import Service.Implements.CategoryService;
import thuvien.Book;

public class Main {
    private SceneBook bookScener;
    private IBook iBook = (BookService) new IService(IBook.class, BookService.class).AddScoped();
    private IAccount iAccount = (AccountService) new IService(IAccount.class, AccountService.class).AddScoped();
    //    private ICategory iCategory = (CategoryService) new IService(ICategory.class, CategoryService.class).AddScoped();
    public void chay(){
        //if(bookScener == null) bookScener = new SceneBook(iBook);
        Scene scene = Scene.getInstance();
        SceneAccount sceneBook = new SceneAccount(iAccount);
        while (true){
            new Menu().display(0);
        }
        //scene.display(0);

    }
    public static void main(String[] args){
        new Main().chay();
    }
}