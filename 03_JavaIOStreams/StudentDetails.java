import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class StudentDetails {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream file = new DataOutputStream(new FileOutputStream("studentdetails.txt")); 
            for(int i = 0;i<3 ;i++){
                System.out.println("enter name : ");
                String name = reader.readLine();
                System.out.println("enter roll number : ");
                String roll = reader.readLine();
                System.out.println("enter cgpa : ");
                String cgpa = reader.readLine();
                String line = "Name : "+ name + " Roll no : "+ roll + " CGPA : "+cgpa;
                file.writeBytes(line+"\n");
            }
            file.close();
            reader.close();
            System.out.println("successfully entered into studentdetails textfile");

            System.out.println("====Reading the text file ====");
            DataInputStream readingfile = new  DataInputStream(new FileInputStream("studentdetails.txt"));
            String line;
            while ((line = readingfile.readLine()) != null) {
                System.out.println(line);
            }
            readingfile.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
