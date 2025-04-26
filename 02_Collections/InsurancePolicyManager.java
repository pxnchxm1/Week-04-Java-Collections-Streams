import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Policy {
    int policyNumber;
    String policyHolderName;
    LocalDate expiryDate;

    public Policy(int policyNumber, String policyHolderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "Number=" + policyNumber +
                ", Name='" + policyHolderName + '\'' +
                ", Expiry=" + expiryDate +
                '}';
    }
}

public class InsurancePolicyManager {
    HashMap<Integer, Policy> mapByNumber = new HashMap<>();
    LinkedHashMap<Integer, Policy> insertionOrderMap = new LinkedHashMap<>();
    TreeMap<LocalDate, List<Policy>> mapByExpiry = new TreeMap<>();

    public void addPolicy(Policy policy) {
        mapByNumber.put(policy.policyNumber, policy);
        insertionOrderMap.put(policy.policyNumber, policy);

        mapByExpiry.putIfAbsent(policy.expiryDate, new ArrayList<>());
        mapByExpiry.get(policy.expiryDate).add(policy);
    }

    public Policy getPolicyByNumber(int number) {
        return mapByNumber.get(number);
    }

    public void listExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);
        System.out.println("Policies expiring within 30 days:");
        mapByExpiry.subMap(today, true, limit, true)
                .values().forEach(list -> list.forEach(System.out::println));
    }

    public void listByHolder(String holderName) {
        System.out.println("Policies held by " + holderName + ":");
        for (Policy p : insertionOrderMap.values()) {
            if (p.policyHolderName.equalsIgnoreCase(holderName)) {
                System.out.println(p);
            }
        }
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        List<Integer> toRemove = new ArrayList<>();

        for (Map.Entry<Integer, Policy> entry : mapByNumber.entrySet()) {
            if (entry.getValue().expiryDate.isBefore(today)) {
                toRemove.add(entry.getKey());
            }
        }

        for (int id : toRemove) {
            Policy p = mapByNumber.remove(id);
            insertionOrderMap.remove(id);
            List<Policy> list = mapByExpiry.get(p.expiryDate);
            list.remove(p);
            if (list.isEmpty()) {
                mapByExpiry.remove(p.expiryDate);
            }
        }

        System.out.println("Expired policies removed.");
    }

    public void displayAll() {
        System.out.println("All Policies (Insertion Order):");
        insertionOrderMap.values().forEach(System.out::println);
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new Policy(101, "Alice", LocalDate.now().plusDays(15)));
        manager.addPolicy(new Policy(102, "Bob", LocalDate.now().plusDays(45)));
        manager.addPolicy(new Policy(103, "Alice", LocalDate.now().minusDays(10)));
        manager.addPolicy(new Policy(104, "Charlie", LocalDate.now().plusDays(5)));

        manager.displayAll();
        System.out.println();

        System.out.println("Retrieve policy by number (102):");
        System.out.println(manager.getPolicyByNumber(102));
        System.out.println();

        manager.listExpiringSoon();
        System.out.println();

        manager.listByHolder("Alice");
        System.out.println();

        manager.removeExpiredPolicies();
        System.out.println();

        manager.displayAll();
    }
}
