import java.net.Socket;

public class AcceptClient extends Thread {

    public static int nbConnected;
    public Socket socket;

    public AcceptClient(Socket socket){
        this.socket = socket;
        nbConnected++;
        start();
    }

    @Override
    public void run() {
            System.out.println("Nombre de connexions : " + nbConnected);
    }
}
