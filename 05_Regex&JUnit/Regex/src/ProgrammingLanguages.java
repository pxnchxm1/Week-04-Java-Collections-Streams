import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ProgrammingLanguages{
	public static void main(String[] args) {
		String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
		Pattern pattern = Pattern.compile("(Java|Python|Cpp|Go|C#|Ruby|Php|Sql|JavaScript)",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}