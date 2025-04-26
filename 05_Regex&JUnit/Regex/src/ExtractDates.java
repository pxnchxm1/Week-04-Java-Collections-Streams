import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractDates{
    public static void main(String[] args) {
       
        String text ="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        System.out.println("Text is : "+text);
        Pattern pattern = Pattern.compile("[0-9]{2}\\/[0-9]{2}\\/[0-9]{2}");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group() + " ");
        }
    }    

}




