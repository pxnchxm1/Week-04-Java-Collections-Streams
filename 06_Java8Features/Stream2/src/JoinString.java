import java.util.function.BiFunction;

public class JoinString {
    public static void main(String[] args) {
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + " " + str2;
        System.out.println(concatenate.apply("Hello", "World"));
    }
}

