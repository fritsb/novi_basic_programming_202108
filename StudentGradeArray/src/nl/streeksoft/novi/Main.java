package nl.streeksoft.novi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
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
            boolean correctAnswer = false;

            // Zolang correctAnswer niet true is, wordt de code in de while-loop uitgevoerd.
            while(!correctAnswer) {
                System.out.println("Voer studentnaam in:");
                studentNames[counter] = input.nextLine();

                System.out.println("Voer cijfer in:");
                grades[counter] = input.nextByte();
                input.nextLine(); // extra nextLine() omdat we hiervoor nextByte() gebruiken.

                // Hieronder controleren we de data en zetten we correctAnswer op true. Daardoor stopt de while-loop.
                if(!studentNames[counter].isEmpty() && (grades[counter] >= 1 && grades[counter] <= 10) ) {
                    correctAnswer = true;
                    System.out.println("Ingevoerde naam is: " + studentNames[counter] + " met cijfer: " + grades[counter]);
                }
                else {
                    System.out.println("Ongeldigde invoer. Probeer opnieuw de gegevens in te voeren.");
                }
            }

        }

        // Hier roepen we dan de printData, printSum en printAverage methoden aan:
        printData(studentNames, grades);
        printSum(grades);
        printAverage(grades);
        printHighestGrade(grades);
        printLowestGrade(grades);
        toUpper(studentNames);
        printData(studentNames, grades);
        /* Het resultaat van de bovenstaande printData-methode klopt niet meer. De cijfers en studenten
        zijn door het sorteren losgekoppeld. Het sorteren gebeurd door de printHighestGrade en printLowestGrade-methoden.
        De oplossing voor het koppelen van studentnaam en cijfer? Een klasse Student aanmaken met daarin 2 variabelen:
        String voor name, en byte voor grade. Dit gaan we woensdag doen!
         */
    }

    public static void printData(String[] names, byte[] grades) {
        for(int i = 0; i < names.length; i++) { 
            System.out.println(names[i] + " met cijfer " + grades[i]);
        }
    }

    public static void printSum(byte[] grades) {
        int result = calculateSum(grades);
        System.out.println("Som: " + result);
    }

    public static void printAverage(byte[] grades) {
        int result = calculateSum(grades);
        System.out.println("Gemiddelde: " + (result / grades.length));
    }
    
    // Losse methode om de som te berekenen. Omdat dit weer code scheelt in de printSum en printAverage methoden.
    // Hierbij wordt int als return type gebruikt, in plaats van void ( = geen return type). 
    public static int calculateSum(byte[] grades) {
        int result = 0;
        for(int i = 0; i < grades.length; i++) {  // in plaats van 5 kan ook names.size() gebruikt worden.
            result += grades[i];
        }
        return result;
    }

    public static void printHighestGrade(byte[] grades) {
        grades = sortArray(grades);
        System.out.println( "Hoogste cijfer: " + grades[grades.length - 1] );
    }

    public static void printLowestGrade(byte[] grades) {
        grades = sortArray(grades);
        System.out.println( "Laagste cijfer: " + grades[0] );
    }

    // De return type van deze methode is String[]. De gesorteerde array wordt teruggegeven. 
    public static String[] sortArray(String[] names, boolean reverse) {
        if(reverse == true) {
            Arrays.sort(names, Collections.reverseOrder());
        }
        else {
            Arrays.sort(names);
        }
        return names;
    }

    // De return type van deze methode is byte[]. De gesorteerde array wordt teruggegeven. 
    public static byte[] sortArray(byte[] grades) {
        Arrays.sort(grades);
        return grades;
    }

    // De return type van deze methode is String[]. De array met uppercase namen wordt teruggegeven. 
    public static String[] toUpper(String[] names) {
        for(int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }
        return names;
    }

}
