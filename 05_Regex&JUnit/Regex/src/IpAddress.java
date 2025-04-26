import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddress {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ip address: ");
        String num = sc.nextLine();
        Pattern pattern = Pattern.compile("^(([1-9]?\\d|[1-2][0-5][0-5])\\.){3}([1-9]?\\d|[1-2][0-5][0-5])");
        Matcher matcher = pattern.matcher(num);
        if(matcher.find()){
            System.out.println("Valid ip address");
        }else{
            System.out.println("Not Valid address");

        }
    }
}
