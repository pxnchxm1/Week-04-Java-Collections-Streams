import java.util.LinkedList;

public class NthElement {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        System.out.println("element at position 4 is : " + list.get(3));
    }
}
