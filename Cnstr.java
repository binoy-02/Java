import java.io.*;
class Person
{
	String name,place;
	int age;
	static int counter;
	
	{
		Person.counter++;
	}
	
	Person(String n,int a,String p)
	{
		name=n;
		place=p;
		age=a;
	}
	Person(String n)
	{
		name=n;
	}
	public void disp()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Place : "+place);
	}
}


public class Cnstr
{
	public static void main(String args[])
	{
	
	DataInputStream dis = new DataInputStream(System.in);
	try
	{
		System.out.println("Enter your name : ");
		String name = dis.readLine();
		System.out.println("Enter your age : ");
		int age = Integer.parseInt(dis.readLine());
		System.out.println("Enter your Place : ");
		String place = dis.readLine();
		Person obj = new Person(name,age,place);
		 obj = new Person(name,age,place);
		 obj = new Person(name,age,place);
		 obj = new Person(name,age,place);
		
		System.out.println(Person.counter);
		obj.disp();
	}
	catch(Exception e)
	{}

	}
}