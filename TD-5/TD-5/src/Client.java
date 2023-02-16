import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        // On crée la socket sur l'IP de localhost sur
        Socket socket = new Socket(InetAddress.getLocalHost(),2000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());
        socket.close();
    }
}