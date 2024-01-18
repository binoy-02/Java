//interfaces

import java.io.*;

interface Inter
{
 public void getdata();
 public void disp();
 
}

class Interclass implements Inter
{
	String name;
	int age;
	String place;
	public void getdata()
	{
		DataInputStream dis = new DataInputStream(System.in);
	    try{
			System.out.println("Enter your name : ");
			name=dis.readLine();
			System.out.println("Enter your age");
			age=Integer.parseInt(dis.readLine());
			System.out.println("Enter your place : ");
			place= dis.readLine();
			
		}	
		catch(Exception e)
		{
		
		}
	}
	public void disp()
	{
			System.out.println(" name : "+name);
			System.out.println("age : "+name);		
			System.out.println("Palce : "+place);
	}
  

}

public class Inter1
{
	public static void main(String args[])
	{
		Interclass obj = new Interclass();
		obj.getdata();
		obj.disp();
	}
}