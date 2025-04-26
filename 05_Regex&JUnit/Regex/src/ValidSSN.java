import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidSSN {
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";
        Pattern pattern = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
