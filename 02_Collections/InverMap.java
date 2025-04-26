
import java.util.ArrayList;
import java.util.HashMap;

public class InverMap {
    static HashMap<Integer,ArrayList<Character>> inverMap(HashMap<Character,Integer> map){
        HashMap<Integer,ArrayList<Character>> res = new HashMap<>();
        for(Character c : map.keySet()){
            int key = map.get(c);
            if (!res.containsKey(key)) {
                ArrayList<Character> list = new ArrayList<>();
                list.add(c);
                res.put(key, list);
            } else {
                res.get(key).add(c);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        HashMap<Character,Integer>  original = new HashMap<>();
        original.put('A',1);
        original.put('B',2);
        original.put('C',1);
        original.put('D',5);
        original.put('E',5);
        System.out.println("Original Map: "+original);
        HashMap<Integer,ArrayList<Character>>  invertedmap = inverMap(original);
        System.out.println(invertedmap);

    }
}
