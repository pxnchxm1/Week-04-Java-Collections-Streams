import java.util.HashSet;
import java.util.Set;

public class EqualSets {
    public static boolean isEqual(Set<Integer> s1,Set<Integer> s2){
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(9, 3, 1));
        Set<Integer> set2 = new HashSet<>(Set.of(1,3,9));
        Set<Integer> s3 = new HashSet<>( Set.of(11,83,9));
        System.out.println("Set 1 : "+set1);
        System.out.println("Set 2 : "+set2);
        System.out.println("Set 3 : "+s3);
        System.out.println("Is set1 and set2 equal? " + isEqual(set1, set2));
        System.out.println( "Is set1 and s3 equal? " + isEqual(set1, s3));
    }
}
