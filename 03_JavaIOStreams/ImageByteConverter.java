import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ImageByteConverter {
    public static void main(String[] args) {
        try{
            
            FileInputStream imgfile = new FileInputStream("img.jpeg");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] arr = new byte[1024];
            int b;
            while((b=imgfile.read(arr))!=-1){
                bos.write(arr,0,b);
            } 
            bos.close();

            FileOutputStream copiedimgfile = new FileOutputStream("copied.jpeg");
            ByteArrayInputStream bais = new ByteArrayInputStream(bos.toByteArray());
            while((b = bais.read(arr))!=-1){
                copiedimgfile.write(arr,0,b);
            }
            bais.close();
            imgfile.close();
            copiedimgfile.close();


            byte[] actual = Files.readAllBytes(Paths.get("img.jpeg"));
            byte[] copy = Files.readAllBytes(Paths.get("copied.jpeg"));
            System.out.println("Is both original and copied files are same ? " + Arrays.equals(actual,copy));
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
    }
}
