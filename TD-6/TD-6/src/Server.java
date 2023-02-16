import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {

        //On crée une ServerSocket et on attend une connexion
        ServerSocket serverSocket = new ServerSocket(3000);
        Socket clientSocket = serverSocket.accept();

        //On prend le flux d'entrée du client
        ObjectInputStream oin = new ObjectInputStream(clientSocket.getInputStream());

        //On lit l'objet que le client envoie
        Personne personne = (Personne) oin.readObject();

        System.out.println(personne.toString());

        //On ferme les sockets
        clientSocket.close();
        serverSocket.close();
    }

}