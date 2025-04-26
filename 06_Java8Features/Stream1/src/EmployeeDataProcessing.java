import java.util.*;
import java.util.stream.Collectors;
class Employee{
	private int id;
	private String empName;
	private String department;
	private double salary;
	public Employee(int id,String empName,String dept,double sal) {
		this.id = id;
		this.empName = empName;
		this.department = dept;
		this.salary = sal;
	}
	public String getName() {
		return this.empName;
	}
	public String getDept() {
		return this.department;
	}
	public double getSal() {
		return this.salary;
	}
	public int getId() {
		return this.id;
	}
	
}
public class EmployeeDataProcessing {
	
	public static void main(String[] args) {
		List<Employee> employeelist = new ArrayList<Employee>();
		employeelist.add(new Employee(1,"Rahul","Sales",90000));
		employeelist.add(new Employee(2,"Rishi","Engineering",190000));
		employeelist.add(new Employee(3,"Maha","Sales",50000));
		employeelist.add(new Employee(4,"Adam","Engineering",40000));
		employeelist.add(new Employee(5,"Aby","Engineering",1200000));
		employeelist.add(new Employee(6,"John","Sales",300000));
		System.out.println("filtered employees who earn more than 80,000 $ in engineering department are :\n====================== ");
		employeelist.stream().filter( employee -> (employee.getDept().equals("Engineering") &&( employee.getSal()> 80000) )).forEach(x -> System.out.println(x.getName()));;
		System.out.println("\n====================Sorting employees based on salary\n================ ");
		employeelist.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).forEach(x->System.out.println(x.getName() + " "+ x.getSal()));
		System.out.println("\n====================Grouping employees by department\n================ ");
		Map<String, List<Employee>> groupByDept = employeelist.stream().collect(Collectors.groupingBy(Employee::getDept));

			groupByDept.forEach((dept, employees) -> {
			    System.out.println(dept + ":");
			    employees.forEach(emp -> System.out.println("  " + emp.getName() + " " + emp.getSal()));
		});
		System.out.println("\n====================Average salary by department\n================ ");
		Map<String, Double> averageSalary = employeelist.stream()
		    .collect(Collectors.groupingBy(
		        Employee::getDept,
		        Collectors.averagingDouble(Employee::getSal)
		    ));

		averageSalary.forEach((dept, avgSal) -> 
		    System.out.println(dept + ": Average Salary = $" + avgSal)
		);

	}
	

}
