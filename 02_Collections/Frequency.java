import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "banana"};
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: fruits){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }
        System.out.println(map);
    }
}
