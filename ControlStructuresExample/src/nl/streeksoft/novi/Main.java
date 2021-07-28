package nl.streeksoft.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Aanmaken van 2 variabelen; 1 krijgt een waarde toegewezen (password), de andere (userPassword) krijgt later een waarde
        int password = 1234;
        int userPassword;

        // input variable (van type Scanner) wordt gebruikt om aan de gebruiker een getal te vragen (dmv nextInt)
        Scanner input = new Scanner(System.in);
        System.out.println("Voer wachtwoord in:");
        userPassword = input.nextInt();

        // de boolean checkPassword krijgt true of false, op basis van de opkomst van de vergelijking van password met userPassword
        boolean checkPassword = (password == userPassword);

        // Hieronder wordt gecontroleerd of de boolean checkPassword true of false is. Als het false is, wordt de applicatie afgesloten
        if(checkPassword) {
            System.out.println("Wachtwoord is correct");
        }
        else {
            System.out.println("Wachtwoord is incorrect");
            System.out.println("Applicatie wordt gesloten. Geen toegang.");
            System.exit(0);
        }

        // Extra informatie over loops: https://www.geeksforgeeks.org/loops-in-java/

        // De getallen 0 t/m 10 worden weergegeven op het scherm met een for-lus
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // De getallen 0 t/m 10 worden weergegeven op het scherm met een while-lus. Hiervoor hebben we een variable counter (type int) nodig.
        int counter = 0;
        while(counter  < 10) {
            System.out.println(counter);
            counter++;
        }

        // De losse karakters van de String courseName worden onder elkaar weergegeven met behulp van een for-lus
        // De lengte van de String wordt opgevraagd door middel van de length()-methode. 1 enkele karakter van de string wordt opgevraagd met behulp van de charAt-methode.
        // Overzicht van String-methodes: https://www.w3schools.com/java/java_ref_string.asp
        String courseName = "Basis Programmeren";
        for(int i = 0; i < courseName.length(); i++) {
            System.out.println(courseName.charAt(i));
        }
    }
}
