package nl.streeksoft.novi;

import java.util.Scanner;

public class Menu {
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
        AppController app = new AppController();

        if(choice == 3) {
            System.exit(0);
        }
        else if(choice == 2) {
            app.printStudentGrades();

        }
        else if(choice == 1) {
            app.start();
        }

        showOptions();
        askUserInput();

    }
}
