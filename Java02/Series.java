import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0, fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += i / fact;
        }
        System.out.println("The sum of the series is " + sum);
    }
}
