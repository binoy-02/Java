package package1;
public class PrimeFactors{
    public static void primeFactors(int number) {
        for(int i = 2; i < number; i++) {
            while(number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }
        if(number > 2) {
            System.out.print(number);
        }
    }
}
