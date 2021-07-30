package nl.streeksoft.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Hieronder zijn 3 variabelen die worden gebruikt
        int grade = 0;
        String studentName = "";
        boolean isRunning = true;

        // Hieronder een while-lus die net zo lang blijft draaien zolang de boolean isRunning true is. isRunning wordt op false gezet op regel 57 als de gebruiker "NEE" opgeeft. 
        while(isRunning) {
            // We gebruiken het Scanner object om gegevens door de gebruiker te laten invoeren. 
            Scanner input = new Scanner(System.in);
            System.out.println("Geef naam op van de student:");
            studentName = input.nextLine(); 
            System.out.println("De naam van de student is: " + studentName);
            System.out.println("Geef het cijfer op:");
            grade = input.nextInt();
            input.nextLine(); // Extra nextLine() omdat we anders een probleem krijgen op regel 54
            System.out.println("De student " + studentName + " heeft als cijfer: " + grade);

            // Keuze-constructie om te controleren of het cijfer is tussen 6 en 10.  
            if (grade >= 6 && grade <= 10) {
                System.out.println("Het cijfer is een voldoende! Gefeliciteerd!");
                // Switch-statement om te controleren of een cijfer gelijk is aan een bepaald getal. 
                switch(grade) {
                    case 10:
                        System.out.println("Een 10, PERFECT! ");
                        break;
                    case 9:
                        System.out.println("Een 9, bijna PERFECT!");
                        break;
                    case 8:
                        System.out.println("Een 8, super GOED!");
                        break;
                    case 7:
                        System.out.println("Een 7, goed!");
                        break;
                    case 6:
                        System.out.println("Een 6, net aan voldoende!");
                        break;
                    default:
                        System.out.println("Dit komt niet voor.");
                        break;
                }
            } else if (grade > 1 && grade < 6) { // als het cijfer onvoldoende is
                System.out.println("Het cijfer is helaas onvoldoende. Volgende keer beter! ");
            } else { // andere scenarios (verkeerde invoer). 
                System.out.println("Er is iets verkeerd gegaan. Probeer opnieuw het cijfer in te voeren.");
            }
            // Wanneer men NEE invoert, wordt de while-lus gestopt; daardoor ook de applicatie. 
            System.out.println("Wil je nog een cijfer invoeren? Type JA of NEE");
            String answer = input.nextLine();
            boolean answerResult = answer.equals("NEE");
            if(answerResult) {
                isRunning = false;
            }

        }

    }
}
