import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('a', 1);
        map1.put('b', 2);
        System.out.println("map 1 : " + map1);
        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('b', 3);
        map2.put('c', 4);
        System.out.println("map 2 : " + map2);
        for(char c : map1.keySet()){
            if(map2.containsKey(c)){
                map1.put(c, map1.get(c)+map2.get(c));
            }
        }
        for(char c : map2.keySet()){
            if(!map1.containsKey(c)){
                map1.put(c,map2.get(c));
            }
        }
        System.out.println("merged map : " + map1);

    }
}
