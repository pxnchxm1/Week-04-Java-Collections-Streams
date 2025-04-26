import java.util.HashMap;

public class MaxKeyValue {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',20);
        map.put('C',15);
        char mxkey = 0;
        int mxvalue = Integer.MIN_VALUE;
        for(char c : map.keySet()){
            if(map.get(c)> mxvalue){
                mxvalue = map.get(c);
                mxkey = c;
            }
        }
        System.out.println("Max Key Value Pair is : "+mxkey+" "+mxvalue);
    }
}
