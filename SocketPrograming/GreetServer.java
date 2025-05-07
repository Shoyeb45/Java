import java.io.*;
import java.net.*;

public class GreetServer {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private BufferedReader console;

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started. Waiting for client...");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
            );
            console = new BufferedReader(new InputStreamReader(System.in));

            String inputLine, outputLine;
            while (true) {
                // Read message from client
                inputLine = in.readLine();
                if (inputLine == null || inputLine.equalsIgnoreCase("exit")) {
                    System.out.println("Client ended the chat.");
                    break;
                }
                System.out.println("Client: " + inputLine);

                // Send reply to client
                System.out.print("Server: ");
                outputLine = console.readLine();
                out.println(outputLine);
                if (outputLine.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            stop();
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }

    public void stop() {
        try {
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error closing server: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        GreetServer server = new GreetServer();
        server.start(6666);
    }
}
