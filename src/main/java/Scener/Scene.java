package Scener;

import Models.InitProtocol;
import Utils.ArrayListCustom;

//Lớp naỳ được sử dụng để quản lý việc SCENE nào sẽ hiển thị, quay lại SCENE trước đó,
//xóa SCENE để hiển thị SCENE khác lên...
public class Scene<T> extends SceneManager<T> implements InitProtocol{
    private ArrayListCustom<Runnable> functions = new ArrayListCustom<>();
    private int indexShow;

    @Override
    public boolean init() {
        return true;
    }
    public static Scene getInstance(){
        return new Scene();
    }
    public void display(int index){
        this.getFunctions().get(index).run();
        this.indexShow = index;
    }

    public void removedScene(){
        this.getFunctions().removed(indexShow);
    }

    public void backScene(){

    }

    public ArrayListCustom<Runnable> getFunctions(){
        return show();
    }

    @Override
    public void readFile() {

    }

    @Override
    public void writeFile() {

    }
}
