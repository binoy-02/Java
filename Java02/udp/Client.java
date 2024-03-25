package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
	 public static void main(String[] args) {
	        DatagramSocket socket = null;

	        try {
	             socket = new DatagramSocket();
                          BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));  
                         while (true) {
	
	                System.out.print("You: ");
	                String message = userInput.readLine();
                               byte[] sendData = message.getBytes();
                              InetAddress serverAddress = InetAddress.getByName("localhost");
	                int serverPort = 9872;

	
	                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
	                socket.send(sendPacket);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (socket != null) {
	                socket.close();
	            }
	        }
	    }}

