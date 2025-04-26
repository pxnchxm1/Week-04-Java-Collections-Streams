import java.util.*;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
            "apple", "banana", "cherry", "date", "elderberry"
        );
        Consumer<String> printUppercase = name -> System.out.println(name.toUpperCase());
        names.forEach(printUppercase);
    }
}
