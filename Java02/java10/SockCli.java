package java10;

import java.io.*;
import java.net.*;

public class SockCli {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 12345);
            System.out.println("Sending a request to server");

            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number to calculate its factorial: ");
            String userInput = userInputReader.readLine();

            PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
            writer.println(userInput); 

            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String response = reader.readLine(); 

            System.out.println("Factorial received from server: " + response);

            userInputReader.close();
            writer.close();
            reader.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

