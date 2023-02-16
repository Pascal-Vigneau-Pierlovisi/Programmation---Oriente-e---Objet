import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;


public class Exercice_3 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/pascalvigneau/Desktop/L3/Programmation - Orientée - Objet/TD-5/TD-5/src/texte.txt");
        FileChannel fc  = fis.getChannel();
        int size = (int)fc.size();
        ByteBuffer bBuff = ByteBuffer.allocate(size);
        System.out.println(fc.read(bBuff));


}
}
