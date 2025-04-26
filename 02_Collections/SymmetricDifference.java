import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1,2,3));
        Set<Integer> set2 = new HashSet<>(Set.of(3,4,5));
        Set<Integer> temp = new HashSet<>(set1);
        System.out.println("set 1 : " + set1);
        System.out.println("set 2 : " + set2);
        set1.removeAll(set2);
        set2.removeAll(temp);
        set1.addAll(set2);
        System.out.println("Symmetric Difference : " + set1);
    }

    
}
