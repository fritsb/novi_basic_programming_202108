package nl.streeksoft.novi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class FileManager {
    String fileName = "data.txt"; // Geen schijf& map-namen! Map-namen zorgen voor errors.


    public void writeData(String data) {
        try {
            File tmpFile = new File(fileName); // Documentation: https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/File.html
            // tmpFile.delete();
            // tmpFile.createNewFile();
            if(tmpFile.isFile() && tmpFile.canWrite()) { // Extra controle of het bestand een bestand is, en of het schrijfbaar is
                FileWriter fw = new FileWriter(tmpFile, true); // Documentation: https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/FileWriter.html
                fw.write(data);
                fw.close();
            }
            else {
                System.out.println("Het opgegeven bestand is geen geldig bestand: " + fileName);
            }
        }
        catch(FileNotFoundException fnfe) {
            System.out.println("Het is helaas niet gelukt om data naar het bestand te schrijven.");
            System.out.println(fnfe.toString());
        }
        catch(Exception ex) {
            System.out.println("Het is helaas niet gelukt om data naar het bestand te schrijven.");
            System.out.println(ex.toString());
        }
    }

    public void readData() {


    }

}
