import java.util.HashSet;
import java.util.Set;

public class IntersectionAndUnionSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(9, 3, 1,4,5));
        Set<Integer> set2 = new HashSet<>(Set.of(1,3,9,2,10));
        System.out.println("set 1 : "+set1);
        System.out.println("set 2 : "+set2);

        Set<Integer> union =new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);

        System.out.println("Union of set 1 and set 2 is "+ union);
        set1.retainAll(set2);
        System.out.println("Intersection : "+ set1);
        
    }
}
