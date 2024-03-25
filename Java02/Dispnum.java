import java.io.*;
public class Dispnum 
{
 public static void main(String[] args) 
{
     try 
       {
        String s,s1;
        System.out.println("Enter the number 1");
        DataInputStream dis = new DataInputStream(System.in);
        s= dis.readLine();
        int m= Integer.parseInt(s);
        System.out.println("Enter the number 2:");
        s1= dis.readLine();
        int n= Integer.parseInt(s1);
        displayNumbersInRange(m, n);
       }
     catch (Exception e)
     {
      System.out.println(e);
      }

    }
    public static void displayNumbersInRange(int m, int n) {
        if (m > n) {
            System.out.println("Invalid input: m should be less than or equal to n");
            return;
        }

        System.out.println("Numbers from " + m + " to " + n + ":");
        while (m <= n) {
            System.out.print(m + " ");
            m++;
        }
    }
}
