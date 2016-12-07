import java.io.*;

public class Ls{
    public static void main(String[] args){
        System.out.println(System.getProperty("user.dir"));
        File file = new File(System.getProperty("user.dir"));

        String[] files = file.list();
        if(files != null){
            for(String currentFile : files){
                System.out.println(currentFile);
            }
        }
    }
}