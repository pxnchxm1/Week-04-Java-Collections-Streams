import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class P{
	String name;
	int age;
	double salary;
	public P(String name,int age,double salary) {
		this.age = age; this.name=name; this.salary = salary;
	}
}

public class Person {
   public static void main(String[] args) {
	   List<P> list = Arrays.asList(new P("Priya",28,90000),new P("Rohan",28,30000),new P("Mohan",38,70000),new P("Devi",24,50000),new P("Nalini",38,80000));
	   list.stream().sorted(Comparator.comparingInt(x -> x.age)).forEach(x-> System.out.println(x.name));
	   
   }
}
