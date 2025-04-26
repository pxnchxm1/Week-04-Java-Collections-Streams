import java.util.*;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
        Optional<Integer> mx = numbers.stream().reduce((a, b) -> Math.max(a, b));
        if (mx.isPresent()) {
            System.out.println("Maximum value: " + mx.get());
        } else {
            System.out.println("List is empty.");
        }
    }
}
