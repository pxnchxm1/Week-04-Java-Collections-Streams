
import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
public class WordCount {
    public static void main(String[] args) {
        try {
            File file = new File("textfile.txt");
            Scanner sc = new Scanner(file);
            HashMap<String,Integer> map = new HashMap<>();
            while(sc.hasNext()){
                String w = sc.next();
                if(map.containsKey(w)){
                    map.put(w,map.get(w)+1);
                }else{
                    map.put(w,1);
                }
            }
            sc.close();
            System.out.println("========== word count in textfile ========");
            System.out.println(map);
          
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
