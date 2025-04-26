import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequentWords {
    public static void main(String[] args) {
        try{
            BufferedReader  reader = new BufferedReader(new FileReader("onesummernight.txt"));
            HashMap<String, Integer> wordcount = new HashMap<>();
            String r;
            while((r=reader.readLine())!=null){
                for(String word : r.trim().split(" ")){
                    wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
                }
            }
            List<Map.Entry<String, Integer>> topWords = wordcount.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).limit(5).toList();
            int i=0;
            while(i!=5){
                System.out.println(topWords.get(i));
                i++;
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
