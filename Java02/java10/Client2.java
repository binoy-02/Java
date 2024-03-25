package java10;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client2 {
	public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",3330);
            System.out.println("Connected to server: " + socket);

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outputWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String receivedMessage, sendMessage;
            while (true) {
                System.out.print("You: ");
                sendMessage = consoleReader.readLine();
                outputWriter.println(sendMessage);
                if (sendMessage.equals("exit")) {
                    System.out.println("Disconnected from server");
                    break;
                }

                receivedMessage = inputReader.readLine();
                if (receivedMessage.equals("exit")) {
                    System.out.println("Server disconnected");
                    break;
                }
                System.out.println("Server: " + receivedMessage);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

