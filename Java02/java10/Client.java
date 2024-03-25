package java10;

import java.io.*;
import java.net.*;
public class Client {
public static void main(String[] args){
try{
 Socket s=new Socket("localhost",12345);
 System.out.println("Sending a request to client.");
ObjectOutputStream dout=new ObjectOutputStream(s.getOutputStream());
dout.writeUTF("Hello Java");
 dout.close();
 s.close();
}
catch (IOException e)
  {
 e.printStackTrace();
  }}}

