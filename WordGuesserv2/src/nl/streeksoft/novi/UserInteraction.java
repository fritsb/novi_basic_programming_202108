package nl.streeksoft.novi;

import java.util.Scanner;

public class UserInteraction {
    public String askUserWord() {
        String userWord = "";

        System.out.print("Raad het woord: ");
        Scanner input = new Scanner(System.in);
        userWord = input.nextLine();

        return userWord;
    }

}
