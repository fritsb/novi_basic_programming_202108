package nl.streeksoft.novi;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String key = "Mary has one cat";
        File inputFile = new File("document.txt");
        File encryptedFile = new File("document.encrypted");
        File decryptedFile = new File("document.decrypted");

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
