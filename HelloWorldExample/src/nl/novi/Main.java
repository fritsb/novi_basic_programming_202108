package nl.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Hello World weergeven in Console output: 
        System.out.println("Hello World");



		// Aanmaken van variabelen name (String) & age (int)
        String name;
        int age = 0;

		// Gebruik van Scanner object om gebruikersinvoer te vragen
        Scanner input = new Scanner(System.in);
        System.out.println("Geef naam op:");
        name = input.nextLine(); // nextLine() wordt gebruikt om tekst op te vragen)
        System.out.println("Je naam is: " + name);

        System.out.println("Wat is je leeftijd?");
        age = input.nextInt(); // nextInt() wordt gebruikt om een geheel getal op te vragen. 
        System.out.println("Je leeftijd is: " + age);

        /* Bewerking van variabele: age = age * 3; */

        System.out.println("Je leeftijd op Mars is: " + age);



    }
}
