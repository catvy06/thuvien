package Utils;

import java.io.Serializable;
import java.util.Arrays;

public class ArrayListCustom <T> implements Serializable {
    private T[] list;

    public ArrayListCustom() {
        list = (T[]) new Object[0];
    }

    public boolean add(T obj){
        try{
            list = Arrays.copyOf(list, list.length + 1);
            list[list.length - 1] = obj;
            return true;
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi thêm phần tử !!!");
        }
        return false;
    }

    public boolean update(int i, T obj){
        try{
            list[i] = obj;
            return true;
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi cập nhật phần tử !!!");
        }
        return false;
    }

    public boolean removed(Object obj){
        try{
            int index = -1;
            if(obj instanceof Integer){
                index = (Integer) obj;
                if(index > this.list.length - 1 || index < 0){
                    System.err.println("Không tìm thấy vị trí cần xóa!!!");
                    return false;
                }
            }

            if(index == -1) {
                for(int i = 0; i < list.length; i++){
                    if(list[i].equals(obj)){
                        index = i;
                        break;
                    }
                }
            }

            for(int i = index; i < list.length - 1; i++){
                list[i] = list[i+1];
            }
            list = Arrays.copyOf(list, list.length - 1);
            return true;
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra khi xóa phần tử !!!");
        }
        return false;
    }

    public T get(int i){
        return list[i];
    }

    public int size(){
        return list.length;
    }

    public T[] getList(){
        return list;
    }
}
