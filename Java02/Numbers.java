import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Numbers from " + num + " to 1:");
        printNumbers(num);
        System.out.println("\nNumbers from 1 to " + num + ":");
        printNumbersReverse(num);
    }
    static void printNumbers(int num) {
        if (num == 0) {
            return;
        } else {
            System.out.print(num + " ");
            printNumbers(num - 1);
        }
    }
    static void printNumbersReverse(int num) {
        if (num == 0) {
            return;
        } else {
            printNumbersReverse(num - 1);
            System.out.print(num + " ");
        }
    }
}
