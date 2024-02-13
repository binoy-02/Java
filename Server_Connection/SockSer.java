//Server
package Nw;
//package Networking;

import java.io.*;  
import java.net.*;  
public class SockSer {  
public static void main(String[] args){  
try{  
ServerSocket ss=new ServerSocket(12345);  
System.out.println("Waiting patiently for connection from client");
Socket s=ss.accept();//establishes connection  
System.out.println("Made connection  with client");
ObjectInputStream dis=new ObjectInputStream(s.getInputStream());  
String  str=(String)dis.readUTF();  // convert data frm UTF format to string
System.out.println("message  from client is "+str);  
ss.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  
