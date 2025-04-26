import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWrite{
    public static void main(String[] args){
        try{
            FileInputStream file = new FileInputStream("textfile.txt");
            FileOutputStream out = new FileOutputStream("outputfile1.txt");
            int word;

            while((word = file.read())!=-1){
                out.write(word);
            }
            System.out.println("Successfully copied content from textfile to output1 file !!!!");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

}