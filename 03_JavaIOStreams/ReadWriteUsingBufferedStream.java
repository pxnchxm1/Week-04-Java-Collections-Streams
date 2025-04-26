import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteUsingBufferedStream{
    public static void main(String[] args){
        try{
            long startTime = System.nanoTime();
            FileInputStream file = new FileInputStream("largetextfile.txt");
            FileOutputStream out = new FileOutputStream("outputfile2.txt");
            int word;
            while((word = file.read())!=-1){
                out.write(word);
            }
            System.out.println("Successfully copied content from largetextfile to outputfile !!!!");
            long normalduration = System.nanoTime() - startTime ;
            System.out.println("Execution duration : "+ normalduration);
            out.close();
            file.close();

            startTime = System.nanoTime();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largetextfile.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("outputbuffer2.txt"));
            int data;
            while((data = bis.read())!= -1){ bos.write(data);}
            System.out.println("successuly moved content from large textfile to outputbuffer2 textfile");
            System.out.println("duration for buffer reader execution : "+ (System.nanoTime()-startTime));
            bis.close();bos.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}