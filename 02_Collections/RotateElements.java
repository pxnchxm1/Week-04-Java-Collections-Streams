import java.util.Arrays;
import java.util.List;

public class RotateElements {
    public static void rotate(List<Integer> arr,int k){
        k = k % arr.size();
        int[] arr2 = new int[arr.size()];
        for(int i = 0;i<arr.size();i++){
            arr2[i] = arr.get((i+k)%arr.size());
        }
        for(int i = 0;i<arr2.length;i++){
            arr.set(i,arr2[i]);
        }

    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(6,7,8,9,10,11,12,1,2,3,4,5);
        System.out.println("before rotation : "+arr);
        rotate(arr,5);
        System.out.println("after rotation  upto position 5 : "+arr);
        System.out.println(arr);
    }
}
