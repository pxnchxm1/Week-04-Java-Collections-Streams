import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidateCreditCard{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter credit card number : ");
		String num = sc.nextLine();
		Pattern pattern = Pattern.compile("^(4|5)\\d{15}");
		Matcher matcher = pattern.matcher(num);
		if(matcher.find()) {
			System.out.println("Valid credit card !");
		}else {
			System.out.println("Not a valid credit card number !");
		}
		
		
		
	}
}