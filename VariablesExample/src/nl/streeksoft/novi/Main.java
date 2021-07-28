package nl.streeksoft.novi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Aanmaken & weergeven van een double variabele (getal met cijfers achter de komma)
        double shoeSize = 41.5;
        System.out.println("Schoenmaat is: " + shoeSize);

        // Aanmaken & weergeven van een char variabele (1 enkele karakter), regel eronder wordt pas de waarde toegewezen
        char clothingSize;
        clothingSize = 'L';
        System.out.println("Kledingmaat is: " + clothingSize);

        // Aanmaken & weergeven van een boolean variabele
        boolean isSunny = true;
        System.out.println("Is het vandaag zonnig: " + isSunny);

        // Aanmaken & weergeven van een float variabele + bewerking erop
        float price = 3.14555f;
        price = price % 3;
        System.out.println("Prijs is: " + price);

        // Voorbeeld van gebruikersinvoer + oplossing voor probleem als men een getal met komma/punt moet invoeren
        Scanner input = new Scanner(System.in);
        // double userPrice = input.nextDouble(); // Hierbij is het probleem dat een punt in het getal tot een error leidt.
        System.out.println("Voer 2 getallen in, de eerste voor getal voor de komma, de tweede voor getal achter de komma:");
        int userPriceEuro = input.nextInt();
        int userPriceCents = input.nextInt();
        System.out.println("Ingevoerde getal: " + userPriceEuro + "." + userPriceCents);
        
    }
}
