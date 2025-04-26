import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidVisa {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number ");
        String num = sc.nextLine();
        Pattern pattern = Pattern.compile("^([4]|[5])//d{16}");
        Matcher matcher = pattern.matcher(num);
        if(matcher.find()){
            System.out.println("Valid card");
        }else{
            System.out.println("Not Valid card");

        }
    }
}
