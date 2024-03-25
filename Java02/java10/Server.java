package java10;

import java.io.*;
import java.net.*;
public class Server {
public static void main(String[] args) {
try{
ServerSocket ss= new ServerSocket(12345);
System.out.println("Server is listening...");
Socket s=ss.accept();
 System.out.println("Made connection with client...");
 ObjectInputStream dis=new ObjectInputStream(s.getInputStream());
 String str=(String)dis.readUTF();
 System.out.println("Message from client is: "+str);
  ss.close();
 dis.close();
}
catch (IOException e)
  {
e.printStackTrace();

 }
 }
}

