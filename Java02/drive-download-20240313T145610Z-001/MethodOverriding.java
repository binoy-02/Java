import java.util.Scanner;
class Person {
    protected String name;
    protected int age;
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the age: ");
        age = sc.nextInt();
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    private int rollNo;
    private String course;   
    public void read() {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the course: ");
        course = sc.nextLine();
    }  
    public void display() {
        super.display();
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class Teacher extends Person {
    private String subject;
    private int experience;
    public void read() {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subject: ");
        subject = sc.nextLine();
        System.out.print("Enter the experience: ");
        experience = sc.nextInt();
    }
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " years");  }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p;
        int choice;
        while (true) {
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    p = new Student();
                    p.read();
                    p.display();
                    break;
                case 2:
                    p = new Teacher();
                    p.read();
                    p.display();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            } } }}
