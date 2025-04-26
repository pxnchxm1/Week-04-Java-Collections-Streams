import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Policy {
    public int policyNumber;
    public String policyHolderName;
    public String policyExpiryDate;
    public String coverageType;
    public int premiumAmount;

    public Policy(int pN, String name, String date, String type, int p) {
        this.policyNumber = pN;
        this.policyHolderName = name;
        this.policyExpiryDate = date;
        this.coverageType = type;
        this.premiumAmount = p;
    }

    public void displayPolicyDetails() {
        System.out.println("Policy Number: " + this.policyNumber);
        System.out.println("Policy Holder Name: " + this.policyHolderName);
        System.out.println("Policy Expiry Date: " + this.policyExpiryDate);
        System.out.println("Coverage Type: " + this.coverageType);
        System.out.println("Premium Amount: " + this.premiumAmount);
        System.out.println("---------------------------");
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        Policy p = (Policy) obj;
        return this.policyNumber == p.policyNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }
}

public class PolicyManagementSystem {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        List<Policy> policyList = List.of(
                new Policy(1, "John Doe", "2024-05-01", "Health", 500),
                new Policy(2, "Jane Doe", "2024-06-18", "Life", 1000),
                new Policy(3, "Alice", "2024-04-25", "Health", 700),
                new Policy(1, "John Doe", "2024-05-01", "Health", 500) // duplicate
        );

        System.out.println("==== Unique Policies ====");
        Set<Policy> uniquePolicies = new HashSet<>(policyList);
        for (Policy p : uniquePolicies) {
            p.displayPolicyDetails();
        }

        System.out.println("==== Policies Expiring Within 30 Days ====");
        LocalDate next30Days = LocalDate.now().plusDays(30);
        for (Policy p : uniquePolicies){
            LocalDate expiry = LocalDate.parse(p.policyExpiryDate, formatter);
            if (!expiry.isBefore(LocalDate.now()) && !expiry.isAfter(next30Days)) {
                p.displayPolicyDetails();
            }
        }

        System.out.println("==== Policies With Coverage Type: Health ====");
        for (Policy p : uniquePolicies) {
            if (p.coverageType.equalsIgnoreCase("Health")) {
                p.displayPolicyDetails();
            }
        }

        System.out.println("==== Duplicate Policy Numbers ====");
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Policy p : policyList) {
            if (!seen.add(p.policyNumber)) {
                duplicates.add(p.policyNumber);
            }
        }
        for (int dup : duplicates) {
            System.out.println("Duplicate Policy Number: " + dup);
        }

        // Performance comparison
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(p -> LocalDate.parse(p.policyExpiryDate, formatter)));

        int num = 100000;
        List<Policy> bulkPolicies = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            bulkPolicies.add(new Policy(i, "User" + i, "2025-12-31", "Auto", 100 + i));
        }

        long start, end;

        System.out.println("==== Performance Comparison ====");

        start = System.nanoTime();
        hashSet.addAll(bulkPolicies);
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.addAll(bulkPolicies);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.addAll(bulkPolicies);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");

        // Search test
        Policy searchPolicy = new Policy(9999, "Search User", "2025-12-31", "Auto", 999);

        start = System.nanoTime();
        hashSet.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");

        
    }
}
