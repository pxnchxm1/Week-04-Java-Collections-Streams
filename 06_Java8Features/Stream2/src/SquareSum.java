import java.util.Arrays;
import java.util.List;
public class SquareSum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("sum of squares of even numbers is : "+ list.stream().filter(x->(x%2==0)).map(y -> y*y).reduce(0,(a,b)-> a+b));
		
	}

}
