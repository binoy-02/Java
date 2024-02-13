//Client
package Nw;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class SockCli {
	public static void main(String args[]) {
	try{  
		Socket s=new Socket("localhost",12345) ;
		System.out.println("Sending request to client");
		ObjectOutputStream dout=new ObjectOutputStream(s.getOutputStream());  
		 
		
				DataInputStream din = new DataInputStream(System.in);
				System.out.println("Enter data to send to server");
						String str = din.readLine();
						dout.writeUTF(str);
						
System.out.println("Just connected to "+s.getRemoteSocketAddress());
dout.flush();
dout.close();
s.close();
		} catch(Exception e) {System.out.println(e);} 
	}
}
