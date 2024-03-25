package java10;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
	public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3330);
            System.out.println("Server started, waiting for clients...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket);

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outputWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String receivedMessage, sendMessage;
            while (true) {
                receivedMessage = inputReader.readLine();
                if (receivedMessage.equals("exit")) {
                    System.out.println("Client disconnected");
                    break;
                }
                System.out.println("Client: " + receivedMessage);

                System.out.print("You: ");
                sendMessage = consoleReader.readLine();
                outputWriter.println(sendMessage);
            }

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

