import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Even numbers up to " + n + ": ");
        displayEvenNumbers(n);
    }
    public static void displayEvenNumbers(int n) {
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
