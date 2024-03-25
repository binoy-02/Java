import java.io.*;
import java.lang.*;
public class MinNum2
{
public static void main(String args[])
{
try
{
String s;
System.out.println("Enter a: ");
DataInputStream dis=new DataInputStream(System.in);
s=dis.readLine();
int a=Integer.parseInt(s);
System.out.println("Enter b: ");
dis=new DataInputStream(System.in);
s=dis.readLine();
int b=Integer.parseInt(s);

System.out.println("Enter c: ");
dis=new DataInputStream(System.in);
s=dis.readLine();
int c=Integer.parseInt(s);
int min=Math.min(Math.min(a,b),c);
System.out.println("Min number is: "+min);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
