import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0, curr = 2;
        for (int i = 1; i <= n; i++) {
            sum += curr;
            curr += 2;
        }
        System.out.println("The sum of the first " + n + " even numbers is " + sum);
    }
}
