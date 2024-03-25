// mathutils/CombinationCalculator.java
package package1;
public class CombinationCalculator {
    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
  }
    public static long calculateCombination(int n, int r) {
        if (n < r) {
            return 0; // Invalid input, as n should be greater than or equal to r
        }
         long numerator = factorial(n);
        long denominator = factorial(r) * factorial(n - r);
         return numerator / denominator;
    }
}

