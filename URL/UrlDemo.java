import java.io.*;
import java.net.*;
public class UrlDemo {
	public static void main(String args[])
	{
		try {
		URL u = new URL("https://rajagiri.edu/careers");
		System.out.println("Protocol"+u.getProtocol());
		System.out.println("Host"+u.getHost());
		System.out.println("Query"+u.getQuery());
		System.out.println("Path"+u.getPath());
		}
		catch(Exception e){System.out.println("e");}
	}

}
