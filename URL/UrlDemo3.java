import java.net.*;
import java.io.*;

public class UrlDemo3 {
	public static void main(String args[])
	{
		try {
			InetAddress i= InetAddress.getByName("www.amazon.com");
			System.out.println("HostName" +i.getHostName());
			System.out.println("IP address "+i.getHostAddress());
			
			InetAddress i2= InetAddress.getLocalHost();
			System.out.println("HostName" +i2.getHostName());
			System.out.println("IP address "+i2.getHostAddress());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
