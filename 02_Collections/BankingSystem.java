import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Withdrawal {
    String accountName;
    int amount;

    Withdrawal(String accountName, int amount) {
        this.accountName = accountName;
        this.amount = amount;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> bank = new HashMap<>();
        bank.put( "John", 10000);
        bank.put( "Janice", 20000);
        bank.put( "Phoebe", 300000);
        bank.put( "Joey", 240000); 
        bank.put( "Monica", 150500);

        TreeMap<String, Integer> tree = new TreeMap<>(bank);
        
        List<Map.Entry<String, Integer>> sortByBalance = new ArrayList<>(bank.entrySet());
        sortByBalance.sort(Map.Entry.comparingByValue());
    
        System.out.println("Sorted by balance:");
        for (Map.Entry<String, Integer> entry : sortByBalance) {
            System.out.println(entry.getKey() + " -> ₹" + entry.getValue());
        }
        System.out.println("Final bank accounts (HashMap): " + bank);

        Queue<Withdrawal> withdrawals = new LinkedList<>();
        withdrawals.offer(new Withdrawal("Janice", 5000));
        withdrawals.offer(new Withdrawal("John", 12000));  
        withdrawals.offer(new Withdrawal("Monica", 100000));

        System.out.println("\nProcessing withdrawal requests:");
        while (!withdrawals.isEmpty()) {
            Withdrawal w = withdrawals.poll();
            if (bank.containsKey(w.accountName)) {
                int currentBalance = bank.get(w.accountName);
                if (currentBalance >= w.amount) {
                    bank.put(w.accountName, currentBalance - w.amount);
                    System.out.println(w.accountName + " withdrew ₹" + w.amount + ". New balance: ₹" + bank.get(w.accountName));
                } else {
                    System.out.println("Failed: " + w.accountName + " has insufficient balance for ₹" + w.amount);
                }
            } else {
                System.out.println("Failed: Account " + w.accountName + " not found.");
            }
        }

        System.out.println("\nUpdated bank accounts: " + bank);
    
    }

    
    
}
