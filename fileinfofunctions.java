import java.io.*;
public class fileinfofunctions
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("E:\\Binoy/JAVA/test.txt");
		boolean fvr =f.createNewFile();
		System.out.println("File Parent "+f.getParent());
		System.out.println("File Name "+f.getName());
		System.out.println("File Absolute path "+f.getAbsolutePath());
		System.out.println("File Length "+f.length());
		System.out.println("Is File directory "+f.isDirectory());
		System.out.println("Is File  "+f.isFile());
	}
}