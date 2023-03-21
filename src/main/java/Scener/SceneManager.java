package Scener;

import Utils.ArrayListCustom;


public abstract class SceneManager<T>{
    ArrayListCustom<Runnable> scenes = new ArrayListCustom<>();

    public boolean add(Runnable function){
        try{
            scenes.add(function);
            return true;
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra");
        }
        return false;
    }
    public boolean update(int index, Runnable obj){
        try{
            scenes.update(index, obj);
            return true;
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra");
        }
        return false;
    }

    public boolean removed(T obj){
        try{
            scenes.removed(obj);
            return true;
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra");
        }
        return false;
    }

    public ArrayListCustom<Runnable> show(){
        try{
            return scenes;
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra");
        }
        return null;
    }
    public abstract void readFile();
    public abstract void writeFile();
}
