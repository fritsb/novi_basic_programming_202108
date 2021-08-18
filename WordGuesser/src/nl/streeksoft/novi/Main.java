package nl.streeksoft.novi;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1: Variabele aanmaken om woord in op te slaan
        // 1b: Verzameling van woorden hebben.
        String word = "Brandweerman";
        String[] words = new String[5];
        words[0] = "Brandweerman";
        words[1] = "Tuinman";
        words[2] = "Fiets";
        words[3] = "Auto";
        words[4] = "Laptop";
        int random = 2;
        word = words[random];

        // 2: Gebruiker vragen om gebruikersinput
        System.out.println("Het woord heeft " + word.length() + " letters.");
        System.out.print("Raad het woord: ");
        Scanner input = new Scanner(System.in);
        String userWord = input.nextLine();

        System.out.println("Woord: " + word);
        System.out.println("Gebruiker invoer: " + userWord);

        // 3: Woord vergelijken met gebruikersinput
        boolean correctAnswer = false;
        if(word.equals(userWord)) {
            correctAnswer = true;
        }

        // 4: Resultaat weergeven: woord is correct geraden, of niet.
        if(correctAnswer) {
            System.out.println("Woord is goed geraden!");
        }
        else {
            System.out.println("Woord is niet goed geraden.");
        }

        // 5: Resultaat opslaan in tekstbestand

        try {
            File myFile = new File("data.txt");
            FileWriter fw = new FileWriter(myFile, true);
            if(correctAnswer) {
                fw.write("Woord: " + word + " is correct geraden" + "\n");
                fw.close();
            }
        }
        catch (Exception ex) {
            System.out.println("Er is iets verkeerd gegaan!");
        }

        // 6: Tekstbestand uitlezen
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

        // 7: tekstbestand encyrpten en decrypten.
        String key = "Mary has one cat";
        File inputFile = new File("data.txt");
        File encryptedFile = new File("document.encrypted");
        File decryptedFile = new File("decrypted.txt");

        // Encryptie
        try {
            CryptoUtils.encrypt(key, inputFile, encryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        // Decryptie
        try {
            CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }



    }
}
