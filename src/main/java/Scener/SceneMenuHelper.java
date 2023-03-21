package Scener;

import java.util.Scanner;

public class SceneMenuHelper<T> extends Scene<T>{
    int choose;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập lựa chọn: ");
        choose = sc.nextInt();
    }
    public void chooseInput(){
        try{
            this.input();
            display(choose);
        }catch (Exception ex){
            System.err.println("Giá trị không được hỗ trợ !!!");
        }
    }
}
