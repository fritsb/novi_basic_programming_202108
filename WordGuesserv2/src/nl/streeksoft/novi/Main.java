package nl.streeksoft.novi;

public class Main {

    public static void main(String[] args) {
        // 1: Variabele aanmaken om woord in op te slaan
        WordGenerator wg = new WordGenerator();
        String word = wg.generate();

        // 2: Gebruiker vragen om gebruikersinput
        UserInteraction ui = new UserInteraction();
        String userWord = ui.askUserWord();

        System.out.println("Woord: " + word);
        System.out.println("Gebruiker invoer: " + userWord);

        // 3: Woord vergelijken met gebruikersinput
       // boolean correctAnswer = false;
        CompareWords cw = new CompareWords();
        //correctAnswer = cw.compare(word,userWord);

        // 4: Resultaat weergeven: woord is correct geraden, of niet.
 //       if(correctAnswer) {
        if(cw.compare(word,userWord) ) {
            System.out.println("Woord is goed geraden!");
        }
        else {
            System.out.println("Woord is niet goed geraden.");
        }

        // 5: Resultaat opslaan in tekstbestand
        FileManager fm = new FileManager();
        fm.writeData(word, userWord);

        // 6: Tekstbestand uitlezen
        fm.readData();

        // 7: tekstbestand encyrpten en decrypten.
        BlackBoxCrypto bbc = new BlackBoxCrypto();
        bbc.doMagic();

    }
}