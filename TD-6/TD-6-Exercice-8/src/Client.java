import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Scanner;

public class Client implements Serializable {

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    private String pseudo;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getPseudo() {
        return pseudo;
    }
    private String message;

    public Client(String pseudo, String message){
        this.pseudo = pseudo;
        this.message = message;
    }

    public String toString(){
        return this.pseudo + " " + this.message;
    }

    public static void main(String[] args) throws Exception {

        // On crée une socket sur à l'adresse 127.0.0.1 port 3000

        Client client = new Client("Default", "Default");

        while(true){
            //On prend le flux de sortie de la socket (client)

            Socket socket = new Socket("localhost", 3000);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            Scanner saisieUtilisateur = new Scanner(System.in);


            System.out.println("Veuillez saisir un pseudo :");
            String pseudo = saisieUtilisateur.next();
            client.setPseudo(pseudo);

            System.out.println("Veuillez saisir un message :");
            String message = saisieUtilisateur.next();

            System.out.println(message);

            //On envoie l'objet
            oos.writeObject(client);
        }
    }

}