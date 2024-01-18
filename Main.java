import java.io.*;
class Parent
{
 String name;
 int age;
 public void disp() 
 {
	System.out.println(name);
	System.out.println(age);
	
 }	 
}

class Child extends Parent
{
	String marsts;
	public void disp()
	{
		super.disp();
		System.out.println(marsts);
	}
}

public class Main
{
	public static void main(String args[])
	{
		Child ob= new Child();
		DataInputStream dis = new DataInputStream(System.in);
		
		try
		{
			System.out.println("enter your name:" );
			String name = dis.readLine();
			ob.name=name;
			System.out.println("enter your age: ");
			int age=Integer.parseInt(dis.readLine());
			ob.age=age;
			System.out.println("enter your Marital StatusS: ");
			String marsts =dis.readLine();
			ob.marsts=marsts;
			ob.disp();
		}
		catch(Exception e)
		{
			
		}
	}
}
	
	