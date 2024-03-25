import java.util.Scanner;

interface Shape {
    void disp();
    double calc();
}

class Circle implements Shape {
    private double radius;

    public void disp() {
        System.out.println("Circle");
    }

    public double calc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        return 3.14 * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double breadth;

    public void disp() {
        System.out.println("Rectangle");
    }

    public double calc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
        return length * breadth;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        Shape s;
        switch (choice) {
            case 1:
                s = new Circle();
                break;
            case 2:
                s = new Rectangle();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        s.disp();
        System.out.println("Area: " + s.calc());
    }
}
