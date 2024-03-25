import java.util.Scanner;
import package1.PrimeFactors;

public class Main1{
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();
        PrimeFactors.primeFactors(number);
    }
}
