package nl.streeksoft.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        askStudentGrades();

    }

    public static void askStudentGrades() {
        // Aanmaken variabelen die ik later nodig heb.
        Scanner input = new Scanner(System.in);
        String[] studentNames = new String[5];
        byte[] grades = new byte[5];

        // Vragen aan gebruiker om gegevens in te voeren, in een loop.
        for(int counter = 0; counter < 5; counter++ ) {
            System.out.println("Voer studentnaam in:");
            studentNames[counter] = input.nextLine();

            System.out.println("Voer cijfer in:");
            grades[counter] = input.nextByte();
            input.nextLine(); // extra nextLine() om een bug op te lossen.

            System.out.println("Ingevoerde naam is: " + studentNames[counter] + " met cijfer: " + grades[counter]);
        }
    }



}
