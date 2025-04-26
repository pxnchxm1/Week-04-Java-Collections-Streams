import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class InputDetails{
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter("personDetails.txt");
            for(int i=0;i<5;i++){
                System.out.println("Enter name : ");
                String name = reader.readLine();
                System.out.println("Enter age : ");
                String age = reader.readLine();
                System.out.println("Enter your favourite programming language : ");
                String lg = reader.readLine();
                String line = "Name : "+ name + " Age : " + age + "Favourite programming language : "+ lg + "\n";
                writer.write(line);
            }
            reader.close();
            writer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
      
    }
}
