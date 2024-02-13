package Server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPSer {
	public static void main(String args[]) {
		try {
	DatagramSocket ds = new DatagramSocket(121);
	byte[] b1 = new byte[323];
	DatagramPacket dp = new DatagramPacket(b1,b1.length);
	ds.receive(dp);
	String s=new String(dp.getData());
	int n = Integer.parseInt(s.trim());
	n++;
	System.out.println("Result is "+n);
	
	
	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}	
}
