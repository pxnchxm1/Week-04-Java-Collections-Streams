import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringFilter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "elephant", "cat", "giraffe", "dog", "dolphin", "lion", "tiger", "butterfly"
        );
        words.stream().filter(word -> (word.length() > 5 && (word.contains("ph")))).collect(Collectors.toList()).forEach(System.out::println);
    }
}

