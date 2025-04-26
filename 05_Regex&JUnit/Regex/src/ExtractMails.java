import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMails {
        public static void main(String[] args) {
       
        String text = "Contact us at support@example.com and info@company.org";
        System.out.println("Text is : "+text);
        Pattern pattern = Pattern.compile("[a-zA-Z0-9+-_]+@[a-zA-Z0-9+-_]+\\.[a-z]{2,3}");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group() + " ");
        }
    }

}
