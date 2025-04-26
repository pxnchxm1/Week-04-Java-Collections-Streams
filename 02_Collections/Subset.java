import java.util.HashSet;
import java.util.Set;

public class Subset {
    public static boolean isSub(Set<Integer> main, Set<Integer> sub) {
        for(int i : sub) {
            if(!main.contains(i)) {
                return false;
            }
        }
         return true;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Set.of(4,5));
        System.out.println("set 1 : " + set1);
        System.out.println("set 2 : " + set2);
        System.out.println("Is set2 subset of set1 : " + isSub(set1,set2));
    }
}
