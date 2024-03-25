import java.util.Scanner;
public class Sumseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int i = 1, j = 1, sum = 0;
        while (i <= n) {
            sum += j;
            j += i;
            i++;
        }
        System.out.println("The sum of the series is " + sum);
    }
}
