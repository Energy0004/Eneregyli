import java.io.File;
import java.io.IOException;

public class Pofic2 {
    public static void main(String[] args) {
        File file = new File("src/Package1.JustClass.java");
        boolean result;
        try{
           result = file.createNewFile();
           if(result){
               System.out.println("file created"+file.getCanonicalPath());
           }else{
               System.out.println("file already exist at location"+file.getCanonicalPath());
           }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}