// 4. Serialization - Save and Retrieve an Object
// 📌 Problem Statement:
// Design a Java program that allows a user to store a list of employees in a file using Object Serialization and later retrieve the data from the file.
// Requirements:
// Create an Employee class with fields: id, name, department, salary.
// Serialize the list of employees into a file (ObjectOutputStream).
// Deserialize and display the employees from the file (ObjectInputStream).
// Handle ClassNotFoundException and IOException.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private int id;
    private String name;
    private String dept;
    private double salary;
    public Employee(int id,String name,String dept,double salary){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public String getDept(){
        return this.dept;
    }
    public double getSal(){
        return this.salary;
    }
    public int getId(){
        return this.id;
    }
    
}

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Rohan", "Sales", 30000));
        employees.add(new Employee(2, "Anita", "HR", 35000));
        employees.add(new Employee(3, "Karan", "IT", 50000));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"));
            oos.writeObject(employees);
            System.out.println("Employee list serialized successfully.");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"));
            List<Employee> deserializedList = (List<Employee>) ois.readObject();
            System.out.println("\nDeserialized Employee List:");
            for (Employee e : deserializedList) {
                System.out.println(e.getName()  );
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
    
}
