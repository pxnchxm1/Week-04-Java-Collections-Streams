@FunctionalInterface
interface Sum{
    int add(int a, int b);
}
public class InterfaceSum {
	public static void main(String[] args) {

        Sum s = (a,b) -> a+b;
        System.out.println("Sum: "+ s.add(20,18));
    }
}
