//Display content in url
import java.io.*;
import java.net.*;
public class Urldemo1 {
	public static void main(String args[])
	{
		try {
		URL u = new URL("http://naac.gov.in/index.php/en/");
		BufferedReader bin = new BufferedReader(new InputStreamReader( u.openStream()));
		BufferedWriter bout = new BufferedWriter(new FileWriter( u.openStream("a.txt")));
		String i;
		while(i=bin.readLine()!=null) {
			System.out.println(i);	
		}
		}
		catch(Exception e){System.out.println("e");}
	}

}