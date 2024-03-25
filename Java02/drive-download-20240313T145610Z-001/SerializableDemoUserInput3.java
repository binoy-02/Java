import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private int age;
    private double salary;
    private transient String address; 

    public Employee(String name, int age, double salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class SerializableDemoUserInput3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter employee age:");
        int age = scanner.nextInt();
        
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();
        
        System.out.println("Enter employee address:");
        
        scanner.nextLine(); 
        String address = scanner.nextLine();
       Employee employee = new Employee(name, age, salary, address);
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(employee.getName());
            out.writeObject(employee.getAge());
            out.writeObject(employee.getSalary());
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        String deserializedName = null;
        int deserializedAge = 0;
        double deserializedSalary = 0.0;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
             deserializedName = (String) in.readObject();
            deserializedAge = (int) ((Integer) in.readObject()); 
            deserializedSalary = (double) ((Double) in.readObject()); 
            in.close();
            fileIn.close();
             System.out.println("Deserialized Employee:");
            System.out.println("Name: " + deserializedName);
            System.out.println("Age: " + deserializedAge);
            System.out.println("Salary: " + deserializedSalary);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
         scanner.close();
    }
}
