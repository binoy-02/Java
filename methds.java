public class methds
{
 static void print()
 {
    System.out.println("Hello");
 }
static void print2(String s)
 {
    System.out.println("Hello "+s);
 }
static int great(int a, int b)
 {
    return Math.max(a,b);
 }
public static void main(String args[])
{
 print();
 print2("Binoy");
    System.out.println( great(10,30));
}
}