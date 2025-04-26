import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ToUpper {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("textfile.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("textfileUpper.txt"));
            int r;
            while(( r = reader.read())!=-1){
                writer.write(Character.toUpperCase((char) r));
            }
            System.out.println("successfully converted to textfileupper textfile in uppercase");
            reader.close();
            writer.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
