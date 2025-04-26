

class FixedSizeQueue {
    private int[] queue;
    private int  size, capacity;

    public FixedSizeQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.size = 0;
    }

    public boolean enqueue(int item) {
        if(size==(capacity)){
            size=0;
        }
        queue[size++] = item;
        return true;
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        System.out.print("Queue: ");
        for (int i = 0; i < queue.length; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
public class CircularQueue {
    public static void main(String[] args) {
        FixedSizeQueue q = new FixedSizeQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println("adding 40");
        q.enqueue(40); 
        q.display();

    }
}
