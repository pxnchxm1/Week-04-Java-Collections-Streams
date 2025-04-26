
import java.util.*;
import java.util.stream.Collectors;
class Policy{
	public int policyNumber ;
	public String holderName ;
	public double premiumAmount ;
	public Policy(int policyNumber, String holderName, double premiumAmount) {
		this.policyNumber = policyNumber;
		this.holderName = holderName ; 
		this.premiumAmount = premiumAmount;	
	}
	
	public String getholderName() {
		return this.holderName;
	}
	public double getPremiumAmount() {
		return this.premiumAmount;
	}
}
public class InsurancePolicy {
	public static void main(String[] args) {
		List<Policy> list = Arrays.asList(
				new Policy(878979743,"Priya",78600),
				new Policy(878979744, "Arjun", 550),
	            new Policy(878979745, "Meera", 620),
	            new Policy(878979746, "Ravi", 17000),
	            new Policy(878979747, "Sneha", 51000),
	            new Policy(878979748, "Karthik", 69000),
	            new Policy(878979749, "Divya", 1200),
	            new Policy(878979750, "Vishal", 80000),
	            new Policy(878979751, "Anita", 60000),
	            new Policy(878979752, "Suresh", 58000),
	            new Policy(878979753, "Pooja", 600));

		 list.stream().filter(x->x.premiumAmount>1200).forEach(y->System.out.println(y.holderName));	
        System.out.println("ordered according to names == \n");
		 list.sort((p1, p2) -> p1.holderName.compareTo(p2.holderName));
		 list.stream().forEach(x->System.out.println(x.holderName));
		 System.out.println("Total premium amount : " + list.stream().map(x->x.premiumAmount).reduce(0.0,(a,b)->a+b));
      list.stream().forEach(x -> System.out.println(" Policy Holder name : " + x.holderName + "-- Policy premium account  : " +x.premiumAmount +"-- Policy Number : " + x.policyNumber));
		list.stream().filter(x->(x.premiumAmount>1000 && x.premiumAmount<2000)).forEach(y->System.out.println(y.holderName+" "+y.premiumAmount));	
       Optional<Policy> p = list.stream().max(Comparator.comparingDouble(Policy :: getPremiumAmount));
       p.ifPresent(pp -> 
       System.out.println("Policy with Highest Premium: " + 
           "Policy number: " + pp.policyNumber + 
           ", Holder name: " + pp.holderName + 
           ", Premium amount: " + pp.premiumAmount)
   );
		
		list.stream().collect(Collectors.groupingBy(p -> p.holderName.charAt(0))).forEach((i,pp)->{
		System.out.println("Initial : " + i +"\n========\n");
		pp.forEach(z->System.out.println(z.holderName));
		});
		
	System.out.println("AVERAGE : "+ list.stream().mapToDouble(Policy::getPremiumAmount).average().orElse(0.0) );
		
		list.stream()
	    .sorted(Comparator.comparingDouble(Policy::getPremiumAmount))
	    .forEach(l -> System.out.println("Policy number: " + l.policyNumber + " - " + "Holder name: " + l.holderName + " - Premium amount: " + l.premiumAmount));


    System.out.println("Any policy exceeds $2,000? " + list.stream().anyMatch(p -> p.premiumAmount > 2000));


		list.stream()
	    .collect(Collectors.groupingBy(f -> {
	        if (f.premiumAmount <= 1000) return "$0-$1,000";
	        else if (f.premiumAmount <= 2000) return "$1,001-$2,000";
	        else return ">$2,000";
	    }, Collectors.counting())).forEach((range, count) -> System.out.println(range + ": " + count));

		

		list.stream().map(Policy::getholderName).distinct().forEach(System.out::println);
		
		
		list.stream()
	    .filter(xx -> xx.getholderName().contains("vi"))
	    .forEach(xx -> System.out.println(xx.policyNumber + " - " + xx.holderName));

		Map<Integer,Double> map = list.stream().collect(Collectors.toMap(t -> t.policyNumber, t -> t.premiumAmount));
		map.forEach((pn,pa)->System.out.println(pn+ " -- "+pa));

	}

}
