import java.io.*;
public class mkdir1
{
	public static void main(String args[])
	{
		File d = new File("E:\\Binoy/JAVA/Test");
		boolean s= d.mkdir();
		if(s)
			System.out.println("Directory Created");
		else
			System.out.println("Directory Not Created!!!");
			
	}
}