import java.io.*;
import java.net.*;
public class UrlDemo2 {
	public static void main(String args[])
		{
			try {
			URL u = new URL("http://naac.gov.in/images/banner/Off.jpg");
			InputStream is  = u.openStream();
			FileOutputStream od = new FileOutputStream("img2.jpg");
			byte b[] = new byte[2000];
			int l;
			while((l=is.read(b))!=-1) {
				od.write(b,0,l);
			}
			}
			catch(Exception e){System.out.println("e");}
		}

	}
