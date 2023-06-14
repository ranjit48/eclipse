package testing_program;

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("localhost", 12345);
            System.out.println("Connected to server.");

            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String input;
            while ((input = consoleReader.readLine()) != null) {
                writer.write(input);
                writer.newLine();
                writer.flush();

                if (input.equalsIgnoreCase("bye")) {
                    System.out.println("Disconnected from server.");
                    break;
                }

                String serverMessage = reader.readLine();
                System.out.println(serverMessage);
            }

            reader.close();
            writer.close();
            consoleReader.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
