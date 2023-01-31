package conditionalsSwitchMethods;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //Hvorfor er en int ligesom en Scanner?
        int number = 8;

        //Hvorfor er en String ligesom en int?
        String myString2 = "Nicklas";

        //Den originale måde at skrive en String på:
        String myString = new String("Nicklas");


        //Opretter scanner objekt
        Scanner sc = new Scanner(System.in);

        //Printing
        System.out.println(sc.nextLine().toUpperCase());


    }
}
