import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MultipleResources {

    public void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            System.out.println("Processing file: " + path);
            try(BufferedWriter bw =  new BufferedWriter(new FileWriter("Combinedtextfile.txt",true))){
                try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        bw.write(line);
                    }
                    System.out.println("successfull writing completed");
                } catch (IOException e) {
                    System.err.println("Error reading file " + path + ": " + e.getMessage());
                }

            }catch(IOException e){
                System.err.println("Error writing to file: " + e.getMessage());

            }
            
        }
    }
    public static void main(String[] args) {
        MultipleResources processor = new MultipleResources();
        List<String> paths = List.of("textfile.txt", "onesummernight.txt");
        processor.processFiles(paths);
    }
}
