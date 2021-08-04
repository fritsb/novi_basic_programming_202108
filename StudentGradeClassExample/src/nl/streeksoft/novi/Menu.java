package nl.streeksoft.novi;

import java.util.Scanner;

public class Menu {
    AppController app = new AppController();

    public void showOptions() {
        System.out.println("Maak een keuze uit de volgende opties:");
        System.out.println("1. Gegevens invoeren");
        System.out.println("2. Gegevens bekijken");
        System.out.println("3. Applicatie afsluiten");
    }

    public void askUserInput() {
        Scanner input = new Scanner(System.in);
        byte choice = input.nextByte();

        System.out.println("De volgende optie is gekozen: " + choice);

        if(choice >= 1 && choice <= 3) {
            if(choice == 3) {
                System.exit(0);
            }
            else if(choice == 2) {
                app.printStudentGrades();

            }
            else if(choice == 1) {
                app.start();
            }
        }
        else {
            System.out.println("Ongeldige invoer. Probeer opnieuw.");
        }

        showOptions();
        askUserInput();

    }
}
