import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = findMax(num1, num2);
        max = findMax(num3, max);
        System.out.println("The maximum of the three numbers is " + max);
    }
    static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else { return num2; }}}
