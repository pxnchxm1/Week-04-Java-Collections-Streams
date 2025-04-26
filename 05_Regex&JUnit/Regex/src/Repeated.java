import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
public class Repeated {
    public static void main(String[] args) {
        String text = "Java is great. I love Java because Java is powerful.";
        Pattern pattern = Pattern.compile("\\b\\w+\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        Map<String, Integer> wordCount = new HashMap<>();
        while (matcher.find()) {
            String word = matcher.group().toLowerCase(); 
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Repeated words:");
        for(String i : wordCount.keySet()) {
        	if(wordCount.get(i)>1) {
        		System.out.println(i);
        	}
        }
    }
}
