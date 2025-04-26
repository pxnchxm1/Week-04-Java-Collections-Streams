import java.util.*;
import java.util.stream.Collectors;
class Product{
	private int id;
	private int quantity;
	private double price;
	public Product(int id,double price,int quantity) {
		this.id = id;
		this.quantity = quantity;
		this.price = price ;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public double getPrice() {
		return this.price;
	}
	public int getId() {
		return this.id;
	}
	
}
class ProductSales{
	private int id;
	private double revenue;
	public ProductSales(int id,double revenue) {
		this.id = id;
		this.revenue = revenue;
	}
	public double getRev() {
		return this.revenue;
	}
	public int getId() {
		return this.id;
	}
	
}
public class ProductAnalysis {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,50.0,4));
		list.add(new Product(2,20.0,10));
		list.add(new Product(3,150.30,14));
		list.add(new Product(4,200.0,43));
		list.add(new Product(5,105.03,20));
		list.add(new Product(6,200.09,40));
		System.out.println("\nProducts that got sold more than 10 \n====================");
		list.stream().filter(x->x.getQuantity()>10).forEach(x->System.out.println("id : " + x.getId()+" "+ " price : "+ x.getPrice() + " sold quantity : " + x.getQuantity()));
		System.out.println("\nNew Product list\n============");
		List<ProductSales> ps = list.stream().map(x -> new ProductSales(x.getId(),x.getPrice()*x.getQuantity())).collect(Collectors.toList());
		ps.stream().forEach(x->System.out.println("Id : " + x.getId() + " revenue : "+ x.getRev()));
		
		System.out.println("\nSorting revenue based list\n============");
		ps.stream()
		   .sorted(Comparator.comparingDouble(ProductSales :: getRev).reversed())  
		   .forEach(x -> System.out.println("id : " + x.getId() + " revenue : " + x.getRev()));
		System.out.println("\nTop 5 Products\n============");
		ps.stream()
		   .sorted(Comparator.comparingDouble(ProductSales :: getRev).reversed()).limit(5) 
		   .forEach(x -> System.out.println("id : " + x.getId() + " revenue : " + x.getRev()));

	}
	

}
