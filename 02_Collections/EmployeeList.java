import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class Employee{
    private String name;
    private String dept;
    public Employee(String name, String dept){
        this.name = name;
        this.dept = dept;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
}
public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("John", "Sales"));
        list.add(new Employee("Alice", "Marketing"));
        list.add(new Employee("Bob", "Sales"));
        list.add(new Employee("Eve", "Marketing"));
        list.add(new Employee("Mike", "Sales"));
        HashMap<String,List<String> > map = new HashMap<>();
        for(Employee e : list){
            if(map.containsKey(e.getDept())){
                map.get(e.getDept()).add(e.getName());
            }else{
                List<String> l = new ArrayList<String>();
                l.add(e.getName());
                map.put(e.getDept(), l);
            }
        }
        System.out.println(map);
        
        
    }
}
