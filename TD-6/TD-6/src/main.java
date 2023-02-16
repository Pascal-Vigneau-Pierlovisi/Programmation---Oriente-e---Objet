import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Personne personne = new Personne("Vigneau", "Pascal", 20);
        Personne personne2 = new Personne("Pierlovisi", "Pascal", 22);
        Serialiser serial = new Serialiser(personne);
        Serialiser serial2 = new Serialiser(personne2);
        serial.transToFolder();
        serial.readToFolder();
        serial2.transToFolder();
        serial2.readToFolder();
    }
}
