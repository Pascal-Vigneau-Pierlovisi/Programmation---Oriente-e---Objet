import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(3000);
        while(true){
            Socket socket = serverSocket.accept();
            AcceptClient client = new AcceptClient(socket);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            out.println("Connection établie");
            out.flush();
            //On prend le flux d'entrée du client
            ObjectInputStream oin = new ObjectInputStream(socket.getInputStream());
            //On lit l'objet que le client envoie
            Client message = (Client) oin.readObject();
            System.out.println(message.toString());
        }

    }
}
