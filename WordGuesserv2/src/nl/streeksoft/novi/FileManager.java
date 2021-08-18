package nl.streeksoft.novi;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileManager {
    // Algemene writeData methode. Deze werkt overal. Je roept het aan als volgt:
    // FileManager fm = new FileManager();
    // fm.writeData("tekst die naar het bestand moet");
     public void writeData(String data) {
        try {
            File myFile = new File("data.txt");
            FileWriter fw = new FileWriter(myFile, true);
            fw.write(data + "\n");
            fw.close();
        }
        catch (Exception ex) {
            System.out.println("Er is iets verkeerd gegaan!");
        }
    }
        
    // Onderstaande writeData methode werkt alleen met de bestanden van WordGuesserv2
    public void writeData(String word, String userWord) {
        CompareWords cw = new CompareWords();
        try {
            File myFile = new File("data.txt");
            FileWriter fw = new FileWriter(myFile, true);
            if(cw.compare(word,userWord) ) {
                fw.write("Woord: " + word + " is correct geraden" + "\n");
                fw.close();
            }
            
        }
        catch (Exception ex) {
            System.out.println("Er is iets verkeerd gegaan!");
        }
    }

    public void readData() {
        System.out.println("Data uit het tekstbestand: ");
        try {
            File myFile = new File("data.txt");
            Scanner fileScanner = new Scanner(myFile);
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(data);
            }
            fileScanner.close();
        }
        catch(Exception ex) {
            System.out.println("Er is iets verkeerd gegaan. ");
        }


    }

}
