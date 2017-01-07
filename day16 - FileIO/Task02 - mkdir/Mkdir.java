import java.io.*;

public class Mkdir{
    public static void main(String[] args){
        Mkdir mk = new Mkdir();
        if(args.length > 0 && args[0] != null){
            mk.createDirectory(args[0]);
        }
        else{
            System.out.println("No directory specified");
        }
            
    }

    private void createDirectory(String dir){

        File file = new File(System.getProperty("user.dir")+"\\"+dir);        

        if(file.exists() && file.isDirectory()){
            System.out.println("Directory already exists.");
            return;
        }
        
        file.mkdir();        
    }
}