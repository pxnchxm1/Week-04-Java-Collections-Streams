import java.util.PriorityQueue;

class Patients {
    private final String name;
    private final int pr;
    public Patients( String name, int pr) {
        this.name = name;
        this.pr = pr;
    }
    public String getName(){
        return this.name;
    }
    public int getPr(){
        return this.pr;
    }
}
public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patients> patients = new PriorityQueue<>((a,b)-> b.getPr() - a.getPr());
        patients.add(new Patients("John", 3));
        patients.add(new Patients("Alice", 5));
        patients.add(new Patients("Bob", 2));
        while(!patients.isEmpty()){
            System.out.println(patients.poll().getName());
            
        }
        
    }
}
