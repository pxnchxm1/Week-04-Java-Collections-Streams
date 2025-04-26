import java.util.LinkedList ;
import java.util.Queue ;
class Stack<T>{
    T type;
    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();
    public void push(T item){
        q1.offer(item);
    }
    public T pop(){
        if (q1.isEmpty()) return null;

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        T temp = q1.poll(); 
        Queue<T> tempQ = q1;
        q1 = q2;
        q2 = tempQ;
        return temp;
    }
    public T peek(){
        if (q1.isEmpty()) return null;

        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }
        T temp = q1.peek(); 
        q2.offer(q1.poll());
        Queue<T> tempQ = q1;
        q1 = q2;
        q2 = tempQ;
        return temp;
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
}
public class StackUsingQueue {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println("Adding 1->2>3 into stack");
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Popping from stack");
        System.out.println(s.pop());
        System.out.println("top element : ");
        System.out.println(s.peek());
    }
    
}
