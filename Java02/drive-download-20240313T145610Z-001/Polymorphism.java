import java.util.Scanner;

interface Shape {
    double getArea();
}

class Triangle implements Shape {
    private double base;
    private double height;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = sc.nextDouble();
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.read();
        System.out.println("Area of the triangle: " + t.getArea());
    }
}
