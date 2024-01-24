import java.io.*;
public class sumFrmUsr
{
 public static void main(String args[])
 { 
	try{
			String s;
			System.out.println("Enter a");
			DataInputStream dis =DataInputStream(System.in);
			s=dis.ReadLine();
			int a= Integer.parseInt(s);
			System.out.println("Enter b");
			dis =new DataInputStream(System.in);
			s=dis.ReadLine();
			int b= Integer.parseInt(s);
			int sum =a+b;
			System.out.println("Sum is :   " +sum);
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
 }
}