import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryNumbers {
    static boolean isBinary(int i){
        while(i>0){
            int rem = i%10;
            if(rem!=0 && rem!=1){
                return false;
            }
            i/=10;
        }
        return true;
    }
    static Queue<String> generateQueue(int n){
        Queue<String> q = new LinkedList<>();
        for(int i = 1;;i++){
            if(q.size()==n){
                return q;
            }
            if(isBinary(i)){
                q.offer(Integer.toString(i));
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = sc.nextInt();
        Queue<String> qu = generateQueue(n);
        System.out.println(qu);
        
       
    }
}