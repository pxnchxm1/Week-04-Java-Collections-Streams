import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ReverseList{
    static void reverseArrayList(List<Integer> list){
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;j--;
        }
    }
    static void reverseLinkedList(List<Integer> list){
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("Original Array List: " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed Array List: " + arrayList);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        System.out.println("Original Linked List: " + linkedList);
        reverseLinkedList(linkedList);
        System.out.println("Reversed Linked List: " + linkedList);
    }
}