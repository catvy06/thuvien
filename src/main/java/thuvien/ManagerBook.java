package thuvien;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static thuvien.WriteFile.pathFile;

public class ManagerBook {
    public Book[] add(){
        System.out.println("Nhập số lượng cần thêm: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Book[] list = new Book[n];
        for (int i =0; i<n; i++){
            Book book = new Book();
            list[i] = book.nhap();
        }
        return list;
    }

    public void save(Book[] books){
        try {
            File file = new File(pathFile("ManagerBook.txt"));
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            if (file.length()==0){
                for (int i = 0; i<books.length; i++){
                    bufferedWriter.write(books[i].toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileWriter.close();
                System.out.println("Book added successfully.");
            } else {
                bufferedWriter.newLine();
                for (int i = 0; i<books.length; i++){
                    bufferedWriter.write(books[i].toString());
                }
                bufferedWriter.close();
                fileWriter.close();
                System.out.println("Book added successfully.");
            }
        } catch (IOException e){
            throw new RuntimeException("Fail! ");
        }
    }
    public void xuat(Book[] books){
        for (int i = 0; i< books.length; i++){
            System.out.println(books[i].toString());
        }
    }
}
