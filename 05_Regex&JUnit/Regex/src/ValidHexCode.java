import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidHexCode {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hexcode : ");
        String num = sc.nextLine();
        Pattern pattern = Pattern.compile("#[0-9A-Za-z]{6}");
        Matcher matcher = pattern.matcher(num);
        if(matcher.find()){
            System.out.println("Valid hexcode");
        }else{
            System.out.println("Not Valid hexcode");

        }
    }

}
