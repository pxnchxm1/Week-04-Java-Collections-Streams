import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractCapitalized {
    public static void main(String[] args) {
       
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        System.out.println("Text is : "+text);
        Pattern pattern = Pattern.compile("[A-Z]\\w+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group() + " ");
        }
    }    

}




