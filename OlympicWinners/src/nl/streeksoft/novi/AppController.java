package nl.streeksoft.novi;

import java.util.ArrayList;

public class AppController {
    ArrayList<OlympicWinner> winners = new ArrayList<OlympicWinner>();

    public AppController() {
        setupWinners();
    }

    public void setupWinners() {
        OlympicWinner siffan = new OlympicWinner("Hassan Sifan",  "vrouw", "Atletiek", "10.000m", (byte) 1);
      /* Bovenstaande regel is hetzelfde als het onderstaande:
        siffan.name = "Hassan Sifan";
        siffan.sport = "Atletiek";
        siffan.discipline = "10.000m";
        siffan.gender = "vrouw";
        siffan.medal = 1; */

        winners.add(siffan);
        OlympicWinner nageeye = new OlympicWinner("Abdi Nageeye", "man", "Atletiek", "Marathon", (byte) 2);
        winners.add(nageeye);
    }

    public void printWinners() {
        for(int i = 0; i < winners.size(); i++) {
            OlympicWinner tmp = winners.get(i);
           // System.out.println(tmp.name + " heeft " + tmp.medal + " gewonnen bij " + tmp.sport + " - " + tmp.discipline );
            System.out.println(tmp);
        }
    }

    public void exportWinners() {
        System.out.println("Export winners methode");
        FileManager fm = new FileManager();

        for(int i = 0; i < winners.size(); i++) {
            OlympicWinner tmp = winners.get(i);
            // System.out.println(tmp.name + " heeft " + tmp.medal + " gewonnen bij " + tmp.sport + " - " + tmp.discipline );
            fm.writeData(tmp.toString() + "\n"); // bovenstaande wordt vervangen door de toString() methode in de OlympicWinner class
        }
    }
}
