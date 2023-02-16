import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;

public class Client implements Serializable {

    public static void main(String[] args) throws Exception {

        // On crée une socket sur à l'adresse 127.0.0.1 port 3000
        Socket socket = new Socket("127.0.0.1", 3000);

        //On prend le flux de sortie de la socket (client)
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

        Personne personne = new Personne("Vigneau", "Pascal", 20);

        //On envoie l'objet
        oos.writeObject(personne);

        //On ferme la socket (client)
        socket.close();
    }

}