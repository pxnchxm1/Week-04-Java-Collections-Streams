import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicates {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,-1,3,7,8,9,10,9,2,-1,3,8,2);
        System.out.println("Array : "+ list);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(" Array after removing duplicates : "+ set);
    }
}
