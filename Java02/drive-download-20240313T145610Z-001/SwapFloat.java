import java.util.Scanner;

public class SwapFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first float number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second float number: ");
        float num2 = sc.nextFloat();
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        swap(num1, num2);
    }

    public static void swap(float num1, float num2) {
        float temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
