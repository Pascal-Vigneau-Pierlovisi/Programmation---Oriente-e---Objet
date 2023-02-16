import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur extends Thread{

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2000);
        Socket socket = serverSocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        System.out.println("User connected to server.");
        out.println("H3LL0");
        out.flush();
        socket.close();
        serverSocket.close();
    }
}