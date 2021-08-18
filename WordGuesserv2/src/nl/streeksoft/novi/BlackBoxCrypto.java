package nl.streeksoft.novi;

import java.io.File;

public class BlackBoxCrypto {
    public void doMagic() {
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
