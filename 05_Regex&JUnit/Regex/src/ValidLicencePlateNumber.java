import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLicencePlateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your licence plate number : ");
        String num = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Z]{2}\\w{4}");
        Matcher matcher = pattern.matcher(num);
        if(matcher.find()){
            System.out.println("Valid licence plate number ");
        }else{
            System.out.println("Not Valid licence plate number");

        }
    }
}
