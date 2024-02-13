package Server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.DatagramSocketImpl;
import java.net.InetAddress;

public class UDPCli {
	public static void main(String[] args)
	{
		try {
			DatagramSocket ds = new DatagramSocket();
			int i=10;
			byte[] b = String.valueOf(i).getBytes();
			InetAddress ia =InetAddress.getLocalHost();
			DatagramPacket dp = new DatagramPacket(b,b.length,ia,121);
			ds.send(dp);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
