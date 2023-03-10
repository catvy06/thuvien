package thuvien;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class WriteFile {
    public static String pathFile(String name){
        String path = Paths.get("").toAbsolutePath().toString().split(":")[1];
        String localpath = Paths.get("\\src\\main\\java\\thuvien\\"+name).toAbsolutePath().toString().split(":")[1];
        return path+localpath;
    }
}
