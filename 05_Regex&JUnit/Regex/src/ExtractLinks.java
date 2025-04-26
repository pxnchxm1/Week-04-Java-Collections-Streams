import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractLinks{
    public static void main(String[] args) {
        String text ="Visit https://www.google.com and http://example.org for more info.";
        System.out.println("Text is : "+text);
        Pattern pattern = Pattern.compile("https?://[\\w.-]+(?:\\.[a-z]{2,})+");
        Matcher matcher = pattern.matcher(text);
        System.out.println("MAILS ARE :");
        while(matcher.find()){
            System.out.println(matcher.group() + " ");
        }
    }

}




