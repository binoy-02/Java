public class Palindrome {
    public static void main(String[] args) {
        int number = 12321; 
        if (isPalindrome(number) == 1) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
    public static int reverseInteger(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static int isPalindrome(int num) {
        int reversed = reverseInteger(num);
        return (num == reversed) ? 1 : 0;
    }
}
