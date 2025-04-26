import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1,2,3,89,20,43,25,10));
        Set<Integer> temp = new TreeSet<>(set1);
        System.out.println("before sorting : " + set1);
        List<Integer> res = new ArrayList<>();
        for(int i:temp){
            res.add(i);
        }
        System.out.println("Ordered list : " + res);
    }

    
}
