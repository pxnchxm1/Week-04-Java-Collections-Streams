import java.io.*;
import java.util.*;
public class Corpus{
    public static void main(String[] args) throws IOException {
        
        String text = "This is a sample text. This sample text is just a sample for finding frequent words. Words, words, words!";
        String[] words = text.split("\\W+");
        Map<String,Integer> freq = new TreeMap<>();
        for(String w : words) {
        	if(freq.containsKey(w)) {
        		freq.put(w.toLowerCase(), freq.get(w)+1);
        	}else {
        		freq.put(w.toLowerCase(), 1);
        	}
        }
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(freq.entrySet());
        sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
      
        int N = 3; 
        System.out.println("Top " + N + " frequent words:");
        for (int i = 0; i < N && i < sortedWords.size(); i++) {
            Map.Entry<String, Integer> entry = sortedWords.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        
    }
}
