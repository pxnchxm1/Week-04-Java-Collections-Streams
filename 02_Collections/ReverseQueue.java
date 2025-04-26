import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseQueue {
    static void reverseQueue(Deque<Integer> q) {
        Deque<Integer> q2 = new ArrayDeque<>();
        while(!q.isEmpty()){
           q2.offer((q.pollLast()));
        }
        while(!q2.isEmpty()){
            q.offerLast(q2.pollFirst());
        }
        

    }
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);
    }
}
