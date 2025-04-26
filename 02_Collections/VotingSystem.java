import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class VotingSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> votes = new HashMap<>();
        LinkedHashMap<String, Integer> linked = new LinkedHashMap<>();
        castVote(votes, linked, "John", 10);
        castVote(votes, linked, "Alice", 20);
        castVote(votes, linked, "Bob", 30);
        castVote(votes, linked, "John", 40); 
        castVote(votes, linked, "Janice", 50);

        
        TreeMap<String, Integer> tree = new TreeMap<>(votes);

        System.out.println("Sorted Results (TreeMap): " + tree);
        System.out.println("Insertion Order (LinkedHashMap): " + linked);
        System.out.println("Final Vote Counts (HashMap): " + votes);
    }

    
    static void castVote(HashMap<String, Integer> voteMap, LinkedHashMap<String, Integer> linkedMap, String name, int voteCount) {
        voteMap.put(name, voteMap.getOrDefault(name, 0) + voteCount);
        linkedMap.put(name, voteMap.get(name));
    }
}
