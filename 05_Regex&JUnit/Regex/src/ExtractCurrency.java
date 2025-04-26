import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50 and Rs.120 and ₹250.";
        Pattern pattern = Pattern.compile("(\\$|₹|Rs\\.)?\\d{1,}\\.?\\d{0,2}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
