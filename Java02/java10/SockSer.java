package java10;

import java.io.*;
import java.net.*;

public class SockSer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(12345);
            System.out.println("Waiting patiently for connection from client");

            Socket s = ss.accept(); 
            System.out.println("Made connection with client");

            BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String input = reader.readLine(); // Read number from client

            int number = Integer.parseInt(input);
            long factorial = calculateFactorial(number);

            PrintWriter writer = new PrintWriter(s.getOutputStream(), true);
            writer.println(factorial); 

            System.out.println("Factorial sent to client: " + factorial);

            reader.close();
            writer.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

