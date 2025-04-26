import java.io.*;
import java.util.*;
public class CorpusSecond{
    public static void main(String[] args) throws IOException {
        
        String text = "This is a sample text. This sample text is just a sample sample for finding frequent words. Words, words, words!";
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
        if (sortedWords.size() > 1) {
            Map.Entry<String, Integer> secondMostFrequent = sortedWords.get(1);
            System.out.println("Second most repeated word: " + secondMostFrequent.getKey() + " with frequency: " + secondMostFrequent.getValue());
        } else {
            System.out.println("There is no second most frequent word.");
        }
       
        
    }
}
