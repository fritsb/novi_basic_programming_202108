package nl.streeksoft.novi;

import java.util.Scanner;

public class Menu {
    private static AppController app  = new AppController();

    // Laat keuzemenu zien
    public static void showOptions() {
        String[] options = new String[3]; // opties staat in verzameling van strings.
        options[0] = "Print medaille winnaars";
        options[1] = "Exporteer medaille winnaars";
        options[2] = "Applicatie afsluiten";

        for(int i = 0; i < options.length; i++) {
            System.out.println( (i+1) + ": " + options[i]);
        }
    }

    // Vraag gebruiker aan gebruikersinvoer
    public static void askUserInput() {
        System.out.print("Geef optie aan: ");
        Scanner input = new Scanner(System.in);

        byte result = input.nextByte();
        input.nextLine();

        switch(result) {
            case 1:
                app.printWinners();
                break;
            case 2:
                app.exportWinners();
                break;
            case 3:
                System.out.println("Applicatie wordt afgesloten");
                System.exit(0);
                break;
            default:

                break;
        }

        showOptions();
        askUserInput();

    }

}
