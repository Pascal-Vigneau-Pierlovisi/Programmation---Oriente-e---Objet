import java.io.*;

public class Serialiser {

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    private Personne personne;

    public Serialiser(Personne personne){
        this.personne = personne;
    }

    public void transToFolder() throws IOException {
        FileOutputStream fichier = new FileOutputStream("monfichier.txt");
        ObjectOutputStream flux = new ObjectOutputStream(fichier);
        flux.writeObject(personne);
    }

    public void readToFolder() throws IOException, ClassNotFoundException {
        FileInputStream fichier = new FileInputStream("monfichier.txt");
        ObjectInput flux = new ObjectInputStream(fichier);
        Object objet = (Personne) flux.readObject();
        System.out.println(objet.toString());
    }
}
