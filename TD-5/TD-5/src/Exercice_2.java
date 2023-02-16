import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercice_2 {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("/Users/pascalvigneau/Desktop/L3/Programmation - Orientée - Objet/TD-5/TD-5/src/texte.txt");
        BufferedReader read = new BufferedReader(file);
        String reader;
        while((reader = read.readLine()) != null){
            System.out.println(reader);
        }
    }
}
