import java.io.BufferedReader;
import java.io.FileReader;

public class ErrorWord {
    public static void main(String[] args) {
        try{
            BufferedReader bf = new BufferedReader(new FileReader("errorfile.txt"));
            String line;
            while ((line = bf.readLine()) != null) {
                if(line.toLowerCase().contains("error")){
                    System.out.println(line);
                }
            }
            bf.close();
        }
        catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
