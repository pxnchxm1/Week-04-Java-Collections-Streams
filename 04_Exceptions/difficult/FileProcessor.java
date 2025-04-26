import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileProcessor {

    public void processFiles(List<String> filePaths) {
        for (String path : filePaths) {
            System.out.println("Processing file: " + path);
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line); 
                }
            } catch (IOException e) {
                System.err.println("Error reading file " + path + ": " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        List<String> paths = List.of("textfile.txt", "onesummernight.txt");
        processor.processFiles(paths);
    }
}
