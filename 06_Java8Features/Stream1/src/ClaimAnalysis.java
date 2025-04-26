
//3. Aggregate: For each policy, calculate the total claimAmount and the average claimAmount. 
//4. Top N: Identify the top 3 policies with the highest total claim amounts. 
import java.util.*;
import java.util.stream.Collectors;
class Claim{
	private int claimId;
	private int policyNumber;
	private double claimAmount;
	private String claimDate;
	private String status;
	public Claim(int claimId,int policyNumber,double claimAmount,String claimDate,String status) {
		this.claimId = claimId;
		this.policyNumber = policyNumber;
		this.claimAmount = claimAmount;
		this.claimDate = claimDate;
		this.status = status;		
	}
	public int getId() {
		return this.claimId;
	}
	public int getPolicyNumber() {
		return this.policyNumber;
	}
	public double getClaimAmount() {
		return this.claimAmount;
	}
	public String getDate() {
		return this.claimDate;
	}
	public String getStatus() {
		return this.status;
	}
	
}
public class ClaimAnalysis {
	public static void main(String[] args) {
		List<Claim> claims = new ArrayList<Claim>();
		claims.add(new Claim(101, 456789012, 5000.75, "2025-04-01", "Pending"));
		claims.add(new Claim(102, 987654321, 2000.50, "2025-04-02", "Approved"));
		claims.add(new Claim(103, 234567890, 1200.25, "2025-04-03", "Rejected"));
		claims.add(new Claim(104, 987654321, 7500.30, "2025-04-04", "Pending"));
		claims.add(new Claim(105, 456789012, 7000.00, "2025-04-05", "Approved"));
		claims.add(new Claim(106, 567890123, 4500.60, "2025-04-06", "Rejected"));
		claims.add(new Claim(107, 987654321, 10000.00, "2025-04-07", "Pending"));
		claims.add(new Claim(108, 234567890, 8500.80, "2025-04-08", "Approved"));
		claims.add(new Claim(109, 987654321, 2900.00, "2025-04-09", "Rejected"));
		claims.add(new Claim(110, 456789012, 4100.40, "2025-04-10", "Pending"));
		
		System.out.println("======\nApproved Claims : \n=======");
		List<Claim> approvedclaims = claims.stream().filter(x->(x.getStatus().equals("Approved") && (x.getClaimAmount()>5000))).collect(Collectors.toList());
		approvedclaims.stream().forEach(x -> System.out.println(x.getId() + " -- "+ x.getPolicyNumber() +"-- "+x.getClaimAmount()));
		
		System.out.println("======\nGroupingBy PolicyNumber\n=======");
		Map<Integer,List<Claim>> groupedclaims = claims.stream().collect(Collectors.groupingBy(Claim::getPolicyNumber));
		groupedclaims.forEach((pN,list)->{
			System.out.println("Policy number : " + pN +"\n===========\n");
			list.forEach(l -> System.out.println(l.getClaimAmount()+"--"+l.getStatus()));
		});
		
		
		System.out.println("======\nAggregate: Total and Average Claim Amount per Policy\n=======");
        Map<Integer, DoubleSummaryStatistics> aggregatedClaims = claims.stream()
                .collect(Collectors.groupingBy(Claim::getPolicyNumber,
                        Collectors.summarizingDouble(Claim::getClaimAmount)));

        aggregatedClaims.forEach((policyNumber, stats) -> {
            System.out.println("Policy Number: " + policyNumber);
            System.out.println("Total Claim Amount: " + stats.getSum());
            System.out.println("Average Claim Amount: " + stats.getAverage());
            System.out.println("==========");
        });
        
    	System.out.println("======\n top 3 policies with the highest total claim amounts.\n=======");
    	List<Map.Entry<Integer, Double>> topPolicies = aggregatedClaims.entrySet().stream()
                .map(entry -> new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue().getSum()))
                .sorted((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()))  // Sort in descending order of total claim amount
                .limit(3)  // Get top 3
                .collect(Collectors.toList());

        topPolicies.forEach(entry -> {
            System.out.println("Policy Number: " + entry.getKey() + ", Total Claim Amount: " + entry.getValue());
        });

    	

       
		
	}

}
