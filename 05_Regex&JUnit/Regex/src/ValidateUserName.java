import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a username : ");
        String username = sc.nextLine();
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,15}";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(username);
        if(matcher.matches()){
            System.out.println("Valid Username 😀");
        }else{
            System.out.println("🥲 Not a valid username !");
        }
    }
}