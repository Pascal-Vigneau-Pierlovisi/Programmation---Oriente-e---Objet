import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(2000);
        while(true){
            Socket socket = serverSocket.accept();
            AcceptClient client = new AcceptClient(socket);
        }

    }
}
