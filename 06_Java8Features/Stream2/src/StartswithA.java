import java.util.Arrays;
import java.util.List;

public class StartswithA {
   public static void main(String[] args) {
	   List<String> list = Arrays.asList("Apple","Mango","Almond","Aeroplane","Juice","Tomato","Fireball","Orange");
	   list.stream().filter(x->x.startsWith("A")).forEach(x->System.out.println(x));
   }
}
